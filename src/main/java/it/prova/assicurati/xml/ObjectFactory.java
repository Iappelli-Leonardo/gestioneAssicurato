//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.25 alle 02:31:48 PM CET 
//


package it.prova.assicurati.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRegistry;

import it.prova.assicurati.model.Assicurato;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.prova.assicurati.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.prova.assicurati.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Assicurati }
     * 
     */
    public Assicurati createAssicurati() {
        return new Assicurati();
    }

    /**
     * Create an instance of {@link Assicurati.Assicurato }
     * 
     */
    public Assicurati.Assicurato createAssicuratiAssicurato() {
        return new Assicurati.Assicurato();
    }
    
	public List<Assicurato> convertiInObject(List<Assicurati.Assicurato> list) {
		List<Assicurato> listCoverted = new ArrayList<Assicurato>();

		for (Assicurati.Assicurato assicurato : list) {
			Assicurato temp = new Assicurato(assicurato.getNome(), assicurato.getCognome(), assicurato.getDataNascita(),
					assicurato.getCodiceFiscale(), assicurato.getNumeroSinistri());
			listCoverted.add(temp);
		}
		return listCoverted;
	}

}
