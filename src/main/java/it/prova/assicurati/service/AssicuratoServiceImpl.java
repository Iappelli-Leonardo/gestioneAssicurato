package it.prova.assicurati.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.assicurati.exception.AssicuratoNotFoundException;
import it.prova.assicurati.model.Assicurato;
import it.prova.assicurati.repository.AssicuratoRepository;

@Service
public class AssicuratoServiceImpl {
	
	@Autowired
	private AssicuratoRepository associatoRepository;
	
	@Transactional
	public List<Assicurato> listAll() {
		return (List<Assicurato>) associatoRepository.findAll();
	}
	@Transactional
	public Assicurato cariscaSingoloElemento(Long id) {
		return associatoRepository.findById(id).orElse(null);
	}

	@Transactional
	public Assicurato inserisciNuovo(Assicurato transientInstance) {
		return associatoRepository.save(transientInstance);
	}

	@Transactional
	public Assicurato get(Long idInput) {
		return associatoRepository.findById(idInput)
				.orElseThrow(() -> new AssicuratoNotFoundException("Element with id " + idInput + " not found."));
	}

	@Transactional
	public Assicurato save(Assicurato input) {
		return associatoRepository.save(input);
	}

}
