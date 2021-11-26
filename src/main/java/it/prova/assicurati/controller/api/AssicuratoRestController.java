package it.prova.assicurati.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.prova.assicurati.model.Assicurato;
import it.prova.assicurati.service.AssicuratoService;
import it.prova.assicurati.service.ProcessXmlService;

@RestController
@RequestMapping(value = "/assicurato", produces = { MediaType.APPLICATION_JSON_VALUE })
public class AssicuratoRestController {

	@Autowired
	ProcessXmlService processXmlService;
	
	@Autowired
	AssicuratoService assicuratoService;

	@GetMapping("/listAll")
	public List<Assicurato> getAll() {
		return assicuratoService.listAll();
	}

	@GetMapping
	public String trigger() {
		return processXmlService.processFile();
	}

}
