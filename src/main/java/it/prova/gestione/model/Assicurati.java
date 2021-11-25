//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2021.11.25 alle 12:33:49 PM CET 
//


package it.prova.gestione.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assicurato">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dataNascita" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="numeroSinistri" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "assicurato"
})
@XmlRootElement(name = "assicurati")
public class Assicurati {

    @XmlElement(required = true)
    protected Assicurati.Assicurato assicurato;

    /**
     * Recupera il valore della proprietà assicurato.
     * 
     * @return
     *     possible object is
     *     {@link Assicurati.Assicurato }
     *     
     */
    public Assicurati.Assicurato getAssicurato() {
        return assicurato;
    }

    /**
     * Imposta il valore della proprietà assicurato.
     * 
     * @param value
     *     allowed object is
     *     {@link Assicurati.Assicurato }
     *     
     */
    public void setAssicurato(Assicurati.Assicurato value) {
        this.assicurato = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dataNascita" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="numeroSinistri" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nome",
        "cognome",
        "dataNascita",
        "numeroSinistri"
    })
    public static class Assicurato {

        @XmlElement(required = true)
        protected String nome;
        @XmlElement(required = true)
        protected String cognome;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataNascita;
        protected int numeroSinistri;

        /**
         * Recupera il valore della proprietà nome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNome() {
            return nome;
        }

        /**
         * Imposta il valore della proprietà nome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNome(String value) {
            this.nome = value;
        }

        /**
         * Recupera il valore della proprietà cognome.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCognome() {
            return cognome;
        }

        /**
         * Imposta il valore della proprietà cognome.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCognome(String value) {
            this.cognome = value;
        }

        /**
         * Recupera il valore della proprietà dataNascita.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataNascita() {
            return dataNascita;
        }

        /**
         * Imposta il valore della proprietà dataNascita.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataNascita(XMLGregorianCalendar value) {
            this.dataNascita = value;
        }

        /**
         * Recupera il valore della proprietà numeroSinistri.
         * 
         */
        public int getNumeroSinistri() {
            return numeroSinistri;
        }

        /**
         * Imposta il valore della proprietà numeroSinistri.
         * 
         */
        public void setNumeroSinistri(int value) {
            this.numeroSinistri = value;
        }

    }

}
