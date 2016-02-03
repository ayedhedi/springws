package lu.sfeir.ayed.springws.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="countrylanguage")
@IdClass(CountryLangIdClass.class)
public class CountryLanguage {
	
	@Id	@Column(name="CountryCode", nullable=false)
	private String countryCode; 
	@Id	@Column(name="Language", nullable=false)
	private String language; 
	@Enumerated(EnumType.STRING)
	@Column(name="IsOfficial", nullable=false)
	private Official isOfficial; 
	@Column(name="Percentage", nullable=false)
	private float percentage;
	
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Official getIsOfficial() {
		return isOfficial;
	}
	public void setIsOfficial(Official isOfficial) {
		this.isOfficial = isOfficial;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
}
