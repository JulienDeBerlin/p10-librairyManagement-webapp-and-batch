//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.08.06 à 05:02:53 PM CEST 
//


package books.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour statusWs.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusWs"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="available"/&gt;
 *     &lt;enumeration value="booked"/&gt;
 *     &lt;enumeration value="borrowed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusWs")
@XmlEnum
public enum StatusWs {

    @XmlEnumValue("available")
    AVAILABLE("available"),
    @XmlEnumValue("booked")
    BOOKED("booked"),
    @XmlEnumValue("borrowed")
    BORROWED("borrowed");
    private final String value;

    StatusWs(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusWs fromValue(String v) {
        for (StatusWs c: StatusWs.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
