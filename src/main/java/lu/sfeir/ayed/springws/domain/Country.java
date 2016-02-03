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
	private int indepYear;
	@Column(name="Population", nullable=false)
	private int population;
	@Column(name="LifeExpectancy", nullable=true)
	private float lifeExpectancy;
	@Column(name="GNP", nullable=true)
	private float gnp;
	@Column(name="GNPOld", nullable=true)
	private float gnpOld;
	@Column(name="LocalName", nullable=false)
	private String localName;
	@Column(name="GovernmentForm", nullable=false)
	private String governmentForm;
	@Column(name="HeadOfState", nullable=true)
	private String headOfState;
	@Column(name="Capital", nullable=true)
	private int cityId;
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
    public int getIndepYear() {
		return indepYear;
	}
	public void setIndepYear(int indepYear) {
		this.indepYear = indepYear;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public float getLifeExpectancy() {
		return lifeExpectancy;
	}
	public void setLifeExpectancy(float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	public float getGnp() {
		return gnp;
	}
	public void setGnp(float gnp) {
		this.gnp = gnp;
	}
	public float getGnpOld() {
		return gnpOld;
	}
	public void setGnpOld(float gnpOld) {
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
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getCode2() {
		return code2;
	}
	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	
	
	
}
