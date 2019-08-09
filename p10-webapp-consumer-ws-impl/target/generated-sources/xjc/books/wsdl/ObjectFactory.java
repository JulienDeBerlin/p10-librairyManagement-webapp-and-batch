//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.08.06 à 05:02:53 PM CEST 
//


package books.wsdl;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the books.wsdl package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: books.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookRequest }
     * 
     */
    public BookRequest createBookRequest() {
        return new BookRequest();
    }

    /**
     * Create an instance of {@link BookResponse }
     * 
     */
    public BookResponse createBookResponse() {
        return new BookResponse();
    }

    /**
     * Create an instance of {@link BookReferenceWs }
     * 
     */
    public BookReferenceWs createBookReferenceWs() {
        return new BookReferenceWs();
    }

    /**
     * Create an instance of {@link ListLibrairyRequest }
     * 
     */
    public ListLibrairyRequest createListLibrairyRequest() {
        return new ListLibrairyRequest();
    }

    /**
     * Create an instance of {@link ListLibrairyResponse }
     * 
     */
    public ListLibrairyResponse createListLibrairyResponse() {
        return new ListLibrairyResponse();
    }

    /**
     * Create an instance of {@link LibrairyWs }
     * 
     */
    public LibrairyWs createLibrairyWs() {
        return new LibrairyWs();
    }

    /**
     * Create an instance of {@link TagsWs }
     * 
     */
    public TagsWs createTagsWs() {
        return new TagsWs();
    }

    /**
     * Create an instance of {@link BookWs }
     * 
     */
    public BookWs createBookWs() {
        return new BookWs();
    }

}
