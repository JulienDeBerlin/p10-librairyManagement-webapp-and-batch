//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.08.06 à 05:02:53 PM CEST 
//


package books.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="titleElement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authorSurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="librairyId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titleElement",
    "authorSurname",
    "tags",
    "librairyId"
})
@XmlRootElement(name = "bookRequest")
public class BookRequest {

    @XmlElement(required = true)
    protected String titleElement;
    @XmlElement(required = true)
    protected String authorSurname;
    protected List<String> tags;
    protected int librairyId;

    /**
     * Obtient la valeur de la propriété titleElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleElement() {
        return titleElement;
    }

    /**
     * Définit la valeur de la propriété titleElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleElement(String value) {
        this.titleElement = value;
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
     * Gets the value of the tags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTags() {
        if (tags == null) {
            tags = new ArrayList<String>();
        }
        return this.tags;
    }

    /**
     * Obtient la valeur de la propriété librairyId.
     * 
     */
    public int getLibrairyId() {
        return librairyId;
    }

    /**
     * Définit la valeur de la propriété librairyId.
     * 
     */
    public void setLibrairyId(int value) {
        this.librairyId = value;
    }

}
