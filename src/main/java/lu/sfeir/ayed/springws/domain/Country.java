package lu.sfeir.ayed.springws.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {

	@Id
	@Column(name="Code")
	private String code;
	@Column(name="Name", nullable=false)
	private String name;
	@Column(name="Region", nullable=false)
	private String region;
	@Column(name="SurfaceArea", nullable=false)
	private float surface;
	@Column(name="Continent", nullable=false)
	private String continent;
	@Column(name="IndepYear", nullable=true)
	private Integer indepYear;
	@Column(name="Population", nullable=false)
	private int population;
	@Column(name="LifeExpectancy", nullable=true)
	private Float lifeExpectancy;
	@Column(name="GNP", nullable=true)
	private Float gnp;
	@Column(name="GNPOld", nullable=true)
	private Float gnpOld;
	@Column(name="LocalName", nullable=false)
	private String localName;
	@Column(name="GovernmentForm", nullable=false)
	private String governmentForm;
	@Column(name="HeadOfState", nullable=true)
	private String headOfState;
	@Column(name="Capital", nullable=true)
	private Integer cityId;
	@Column(name="Code2", nullable=false)
	private String code2;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Float getGnp() {
        return gnp;
    }

    public void setGnp(Float gnp) {
        this.gnp = gnp;
    }

    public Float getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Float gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
