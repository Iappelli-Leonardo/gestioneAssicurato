package it.prova.assicurati.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.assicurati.model.Assicurato;
import it.prova.assicurati.repository.AssicuratoRepository;

@Service
public class AssicuratoServiceImpl implements AssicuratoService{
	
	@Autowired
	private AssicuratoRepository assicuratoRepository;
	
	@Transactional
	public List<Assicurato> listAll() {
		return (List<Assicurato>) assicuratoRepository.findAll();
	}
	
	@Transactional
	public boolean AggiungiAssicurato(List<Assicurato> assicurati) {
		for (Assicurato assicuratoItem : assicurati) {
			
			Assicurato assicurato = assicuratoRepository.findByCodiceFiscale(assicuratoItem.getCodiceFiscale());
			
			if(assicurato != null) {
				assicurato.setNumeroSinistri(assicurato.getNumeroSinistri() + assicuratoItem.getNumeroSinistri());
				assicuratoRepository.save(assicurato);
			}else {
				assicuratoRepository.save(assicuratoItem);
			}
		}
		return true;
	}

}
