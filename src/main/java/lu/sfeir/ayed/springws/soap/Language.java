//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.02 à 04:20:19 PM CET 
//


package lu.sfeir.ayed.springws.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour language complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="language">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="official" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="percentage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "language")
public class Language {

    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "official")
    protected Boolean official;
    @XmlAttribute(name = "percentage")
    protected Float percentage;

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété official.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfficial() {
        return official;
    }

    /**
     * Définit la valeur de la propriété official.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfficial(Boolean value) {
        this.official = value;
    }

    /**
     * Obtient la valeur de la propriété percentage.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercentage() {
        return percentage;
    }

    /**
     * Définit la valeur de la propriété percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercentage(Float value) {
        this.percentage = value;
    }

}
