package it.prova.assicurati.service;

import java.io.File;
import java.util.List;

import it.prova.assicurati.xml.Assicurati;

public interface GestioneFileService {

public List<Assicurati.Assicurato> unmarshal(File file);
	
	public int filesSpostati(String path);
	
}
