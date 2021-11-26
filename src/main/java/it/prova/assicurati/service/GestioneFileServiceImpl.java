package it.prova.assicurati.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import it.prova.assicurati.xml.Assicurati;

@Service
public class GestioneFileServiceImpl implements GestioneFileService{
	
	@Override
	public List<Assicurati.Assicurato> unmarshal(File file) {
		JAXBContext jaxbContext;
		Assicurati ass = null;
		try {
			jaxbContext = JAXBContext.newInstance(Assicurati.class);
			Unmarshaller jaxbUnmarshaller = null;
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ass = (Assicurati) jaxbUnmarshaller.unmarshal(file);

		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return ass.getAssicurato();
	}

	@Override
	public int filesSpostati(String path) {
		File folder = new File("C:\\Corso\\ws-eclipse\\fileXml\\");
		File[] listOfFiles = folder.listFiles();

		if (listOfFiles.length == 0)
			return 1;

		String nomeFile = listOfFiles[listOfFiles.length - 1].getName();

		String numeroConEstensione = nomeFile.substring(10);
		String numero = numeroConEstensione.substring(0, numeroConEstensione.length() - 4);

		return Integer.parseInt(numero) + 1;
	}

}
