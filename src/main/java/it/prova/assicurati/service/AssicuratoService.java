package it.prova.assicurati.service;

import java.util.List;

import it.prova.assicurati.model.Assicurato;

public interface AssicuratoService {
	
	public Assicurato inserisciNuovo(Assicurato assicuratoInstance);
	
	public Assicurato get(Long idInput);

	public Assicurato cariscaSingoloElemento(Long id);
	
	public List<Assicurato> listAll();
	
}
