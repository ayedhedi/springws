//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.03 à 04:41:34 PM CET 
//


package lu.sfeir.ayed.springws.ConfigurationsTests.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour country complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="country">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://sfeir.lu/guides/gs-producing-web-service}countryCode"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="continent" type="{http://sfeir.lu/guides/gs-producing-web-service}continent"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="surfaceArea" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="indepYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="population" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lifeExpectancy" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="gnp" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="gnpOld" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="localName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="governmentForm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headOfState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="languages" type="{http://sfeir.lu/guides/gs-producing-web-service}language" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "country", propOrder = {
    "code",
    "name",
    "continent",
    "region",
    "surfaceArea",
    "indepYear",
    "population",
    "lifeExpectancy",
    "gnp",
    "gnpOld",
    "localName",
    "governmentForm",
    "headOfState",
    "capital",
    "code2",
    "languages"
})
public class Country {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Continent continent;
    @XmlElement(required = true)
    protected String region;
    protected float surfaceArea;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar indepYear;
    protected int population;
    protected Float lifeExpectancy;
    protected Float gnp;
    protected Float gnpOld;
    @XmlElement(required = true)
    protected String localName;
    @XmlElement(required = true)
    protected String governmentForm;
    protected String headOfState;
    protected String capital;
    @XmlElement(required = true)
    protected String code2;
    protected List<Language> languages;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

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
     * Obtient la valeur de la propriété continent.
     * 
     * @return
     *     possible object is
     *     {@link Continent }
     *     
     */
    public Continent getContinent() {
        return continent;
    }

    /**
     * Définit la valeur de la propriété continent.
     * 
     * @param value
     *     allowed object is
     *     {@link Continent }
     *     
     */
    public void setContinent(Continent value) {
        this.continent = value;
    }

    /**
     * Obtient la valeur de la propriété region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Définit la valeur de la propriété region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtient la valeur de la propriété surfaceArea.
     * 
     */
    public float getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * Définit la valeur de la propriété surfaceArea.
     * 
     */
    public void setSurfaceArea(float value) {
        this.surfaceArea = value;
    }

    /**
     * Obtient la valeur de la propriété indepYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIndepYear() {
        return indepYear;
    }

    /**
     * Définit la valeur de la propriété indepYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIndepYear(XMLGregorianCalendar value) {
        this.indepYear = value;
    }

    /**
     * Obtient la valeur de la propriété population.
     * 
     */
    public int getPopulation() {
        return population;
    }

    /**
     * Définit la valeur de la propriété population.
     * 
     */
    public void setPopulation(int value) {
        this.population = value;
    }

    /**
     * Obtient la valeur de la propriété lifeExpectancy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     * Définit la valeur de la propriété lifeExpectancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLifeExpectancy(Float value) {
        this.lifeExpectancy = value;
    }

    /**
     * Obtient la valeur de la propriété gnp.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGnp() {
        return gnp;
    }

    /**
     * Définit la valeur de la propriété gnp.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGnp(Float value) {
        this.gnp = value;
    }

    /**
     * Obtient la valeur de la propriété gnpOld.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGnpOld() {
        return gnpOld;
    }

    /**
     * Définit la valeur de la propriété gnpOld.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGnpOld(Float value) {
        this.gnpOld = value;
    }

    /**
     * Obtient la valeur de la propriété localName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Définit la valeur de la propriété localName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Obtient la valeur de la propriété governmentForm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentForm() {
        return governmentForm;
    }

    /**
     * Définit la valeur de la propriété governmentForm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentForm(String value) {
        this.governmentForm = value;
    }

    /**
     * Obtient la valeur de la propriété headOfState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadOfState() {
        return headOfState;
    }

    /**
     * Définit la valeur de la propriété headOfState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadOfState(String value) {
        this.headOfState = value;
    }

    /**
     * Obtient la valeur de la propriété capital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Définit la valeur de la propriété capital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Obtient la valeur de la propriété code2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode2() {
        return code2;
    }

    /**
     * Définit la valeur de la propriété code2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode2(String value) {
        this.code2 = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Language }
     * 
     * 
     */
    public List<Language> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<Language>();
        }
        return this.languages;
    }

}
