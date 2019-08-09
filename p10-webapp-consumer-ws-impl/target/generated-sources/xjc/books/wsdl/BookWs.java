//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.08.06 à 05:02:53 PM CEST 
//


package books.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour bookWs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bookWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="datePurchase" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="status" type="{http://com.berthoud.p7}statusWs"/&gt;
 *         &lt;element name="librairy" type="{http://com.berthoud.p7}librairyWs"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookWs", propOrder = {
    "id",
    "datePurchase",
    "status",
    "librairy"
})
public class BookWs {

    protected int id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datePurchase;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusWs status;
    @XmlElement(required = true)
    protected LibrairyWs librairy;

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
     * Obtient la valeur de la propriété datePurchase.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePurchase() {
        return datePurchase;
    }

    /**
     * Définit la valeur de la propriété datePurchase.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePurchase(XMLGregorianCalendar value) {
        this.datePurchase = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link StatusWs }
     *     
     */
    public StatusWs getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusWs }
     *     
     */
    public void setStatus(StatusWs value) {
        this.status = value;
    }

    /**
     * Obtient la valeur de la propriété librairy.
     * 
     * @return
     *     possible object is
     *     {@link LibrairyWs }
     *     
     */
    public LibrairyWs getLibrairy() {
        return librairy;
    }

    /**
     * Définit la valeur de la propriété librairy.
     * 
     * @param value
     *     allowed object is
     *     {@link LibrairyWs }
     *     
     */
    public void setLibrairy(LibrairyWs value) {
        this.librairy = value;
    }

}
