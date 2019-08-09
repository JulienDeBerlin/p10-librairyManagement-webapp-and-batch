//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.08.06 à 05:02:53 PM CEST 
//


package customersAndLoans.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour loanWs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="loanWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateBegin" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateEnd" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateBack" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="numberExtensions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="book" type="{http://com.berthoud.p7}bookWs"/&gt;
 *         &lt;element name="customerWs" type="{http://com.berthoud.p7}customerWs"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanWs", propOrder = {
    "id",
    "dateBegin",
    "dateEnd",
    "dateBack",
    "numberExtensions",
    "book",
    "customerWs"
})
public class LoanWs {

    protected int id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateBegin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateEnd;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateBack;
    protected int numberExtensions;
    @XmlElement(required = true)
    protected BookWs book;
    @XmlElement(required = true)
    protected CustomerWs customerWs;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété dateBegin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Définit la valeur de la propriété dateBegin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Obtient la valeur de la propriété dateEnd.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Définit la valeur de la propriété dateEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Obtient la valeur de la propriété dateBack.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBack() {
        return dateBack;
    }

    /**
     * Définit la valeur de la propriété dateBack.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBack(XMLGregorianCalendar value) {
        this.dateBack = value;
    }

    /**
     * Obtient la valeur de la propriété numberExtensions.
     * 
     */
    public int getNumberExtensions() {
        return numberExtensions;
    }

    /**
     * Définit la valeur de la propriété numberExtensions.
     * 
     */
    public void setNumberExtensions(int value) {
        this.numberExtensions = value;
    }

    /**
     * Obtient la valeur de la propriété book.
     * 
     * @return
     *     possible object is
     *     {@link BookWs }
     *     
     */
    public BookWs getBook() {
        return book;
    }

    /**
     * Définit la valeur de la propriété book.
     * 
     * @param value
     *     allowed object is
     *     {@link BookWs }
     *     
     */
    public void setBook(BookWs value) {
        this.book = value;
    }

    /**
     * Obtient la valeur de la propriété customerWs.
     * 
     * @return
     *     possible object is
     *     {@link CustomerWs }
     *     
     */
    public CustomerWs getCustomerWs() {
        return customerWs;
    }

    /**
     * Définit la valeur de la propriété customerWs.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerWs }
     *     
     */
    public void setCustomerWs(CustomerWs value) {
        this.customerWs = value;
    }

}
