package it.prova.assicurati.repository;

import org.springframework.data.repository.CrudRepository;

import it.prova.assicurati.model.Assicurato;

public interface AssicuratoRepository extends CrudRepository<Assicurato, Long>{
	public Assicurato findByCodiceFiscale(String codiceFiscale);
}
