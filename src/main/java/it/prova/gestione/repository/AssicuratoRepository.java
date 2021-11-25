package it.prova.gestione.repository;

import org.springframework.data.repository.CrudRepository;

import it.prova.gestione.model.Assicurato;

public interface AssicuratoRepository extends CrudRepository<Assicurato, Long>{
	public Assicurato findByCodiceFiscale(String codiceFiscale);
}
