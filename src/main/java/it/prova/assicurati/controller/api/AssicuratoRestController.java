package it.prova.assicurati.controller.api;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.prova.assicurati.model.Assicurato;
import it.prova.assicurati.service.AssicuratoService;
import it.prova.assicurati.xml.Assicurati;

@RestController
@RequestMapping(value = "/assicurato", produces = { MediaType.APPLICATION_JSON_VALUE })
public class AssicuratoRestController {

	@Autowired
	AssicuratoService assicuratoService;

	@GetMapping("/listAll")
	public List<Assicurato> getAll() {
		return assicuratoService.listAll();
	}

	@GetMapping
	public void trigger() {

		try {

			File file = new File("C:\\Corso\\ws-eclipse\\fileXml\\assicurati2.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Assicurati.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Assicurati assicuratiDaUnmarshal = (Assicurati) jaxbUnmarshaller.unmarshal(file);

			List<Assicurati.Assicurato> listaAssicurati = assicuratiDaUnmarshal.getAssicurato();

			List<Assicurato> assicurati = new ArrayList<Assicurato>();
			for (Assicurati.Assicurato assicuratoItem : listaAssicurati) {
				Assicurato tmp = new Assicurato(assicuratoItem.getNome(), assicuratoItem.getCognome(), assicuratoItem.getDataNascita(),
						assicuratoItem.getCodiceFiscale(), assicuratoItem.getNumeroSinistri());

				assicurati.add(tmp);
			}

			for (Assicurato assicuratoItem : assicurati) {
				if (assicuratoItem.getNumeroSinistri() < 0 || //controllo se sono presenti dei numeri nella stringa
						assicuratoItem.getNome().matches(".*\\d.*") || assicuratoItem.getCognome().matches(".*\\d.*")) {
					file.renameTo(new File("C:\\Corso\\ws-eclipse\\xml\\error\\assicurati2.xml"));
				}
			}
				assicuratoService.aggiungiAssicurato(assicurati);
				
			file.renameTo(new File("C:\\Corso\\ws-eclipse\\xml\\pass\\assicurati2.xml"));

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
