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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour bookReferenceWs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bookReferenceWs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorSurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isbn13" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="publisher" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yearPublication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookReferenceWs", propOrder = {
    "id",
    "title",
    "authorFirstName",
    "authorSurname",
    "isbn13",
    "publisher",
    "summary",
    "yearPublication"
})
public class BookReferenceWs {

    protected int id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String authorFirstName;
    @XmlElement(required = true)
    protected String authorSurname;
    @XmlElement(required = true)
    protected String isbn13;
    @XmlElement(required = true)
    protected String publisher;
    @XmlElement(required = true)
    protected String summary;
    @XmlElement(required = true)
    protected String yearPublication;

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
     * Obtient la valeur de la propriété title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Définit la valeur de la propriété title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propriété authorFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Définit la valeur de la propriété authorFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorFirstName(String value) {
        this.authorFirstName = value;
    }

    /**
     * Obtient la valeur de la propriété authorSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorSurname() {
        return authorSurname;
    }

    /**
     * Définit la valeur de la propriété authorSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorSurname(String value) {
        this.authorSurname = value;
    }

    /**
     * Obtient la valeur de la propriété isbn13.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbn13() {
        return isbn13;
    }

    /**
     * Définit la valeur de la propriété isbn13.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbn13(String value) {
        this.isbn13 = value;
    }

    /**
     * Obtient la valeur de la propriété publisher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Définit la valeur de la propriété publisher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Obtient la valeur de la propriété summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Définit la valeur de la propriété summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Obtient la valeur de la propriété yearPublication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearPublication() {
        return yearPublication;
    }

    /**
     * Définit la valeur de la propriété yearPublication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearPublication(String value) {
        this.yearPublication = value;
    }

}
