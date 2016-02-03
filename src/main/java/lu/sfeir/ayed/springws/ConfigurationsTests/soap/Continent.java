//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.02.03 à 04:41:34 PM CET 
//


package lu.sfeir.ayed.springws.ConfigurationsTests.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour continent.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="continent">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASIA"/>
 *     &lt;enumeration value="EUROPE"/>
 *     &lt;enumeration value="NORTH_AMERICA"/>
 *     &lt;enumeration value="AFRICA"/>
 *     &lt;enumeration value="OCEANIA"/>
 *     &lt;enumeration value="ANTARCTICA"/>
 *     &lt;enumeration value="SOUTH_AMERICA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "continent")
@XmlEnum
public enum Continent {

    ASIA,
    EUROPE,
    NORTH_AMERICA,
    AFRICA,
    OCEANIA,
    ANTARCTICA,
    SOUTH_AMERICA;

    public String value() {
        return name();
    }

    public static Continent fromValue(String v) {
        return valueOf(v);
    }

}
