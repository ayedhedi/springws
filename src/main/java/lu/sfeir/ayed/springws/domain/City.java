package lu.sfeir.ayed.springws.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@Column(name="ID")
	private int id;
	private String district;
	private int population;
	private String name;
	private String countryCode;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="District",nullable=false)	
	@NotNull
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Column(name="Population",nullable=false)	
	@NotNull
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Column(name="Name",nullable=false)	
	@NotNull
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="CountryCode",nullable=false)	
	@NotNull
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
