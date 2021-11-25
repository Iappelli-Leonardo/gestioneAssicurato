package it.prova.assicurati.service;

import java.util.List;

import it.prova.assicurati.model.Assicurato;

public interface AssicuratoService {
	
	public List<Assicurato> listAll();
	
	boolean AggiungiAssicurato(List<Assicurato> assicurati);
	
}
