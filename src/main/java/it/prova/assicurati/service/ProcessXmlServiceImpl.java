package it.prova.assicurati.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.assicurati.model.Assicurato;
import it.prova.assicurati.xml.Assicurati;
import it.prova.assicurati.xml.ObjectFactory;

@Service
public class ProcessXmlServiceImpl implements ProcessXmlService{
	
	@Autowired
	AssicuratoService service;

	@Autowired
	GestioneFileService gestioneFile;

	ObjectFactory factory = new ObjectFactory();

	@Override
	public String processFile() {
		File folder = new File("C:\\Corso\\ws-eclipse\\fileXml");
		File[] listOfFiles = folder.listFiles();

		// ciclo per valutare tutti i file
		for (int i = 0; i < listOfFiles.length; i++) {

			boolean spostato = false;

			// questo if evita che vengano analizzate le cartelle presenti nella root
			if (listOfFiles[i].isDirectory())
				break;

			String nome = listOfFiles[i].getName();
			File file = new File("C:\\Corso\\ws-eclipse\\fileXml\\" + nome);

			List<Assicurati.Assicurato> assicurati = gestioneFile.unmarshal(file);

			List<Assicurato> assicuratiModel = factory.convertiInObject(assicurati);

			// regola di business
			for (Assicurato assicurato : assicuratiModel) {
				if (assicurato.getNumeroSinistri() < 0) {
					int fileXml = gestioneFile.filesSpostati("error");
					file.renameTo(new File("C:\\Corso\\ws-eclipse\\xml\\" + fileXml + ".xml"));
					spostato = true;
					break;
				}
			}

			// se il file è stato spostato interrompo l'attuale giro di ciclo
			if (spostato)
				continue;

			if (!service.aggiungiAssicurato(assicuratiModel))
				throw new RuntimeException("Errore nel file xml");

			int fileXml = gestioneFile.filesSpostati("pass");
			file.renameTo(new File("C:\\Corso\\ws-eclipse\\xml\\" + fileXml + ".xml"));

		}
		return "ok";
	}

}
