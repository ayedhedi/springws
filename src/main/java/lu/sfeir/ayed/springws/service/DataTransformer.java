package lu.sfeir.ayed.springws.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import lu.sfeir.ayed.springws.soap.Continent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.sfeir.ayed.springws.domain.City;
import lu.sfeir.ayed.springws.domain.Country;
import lu.sfeir.ayed.springws.repository.CityRepository;
import org.springframework.util.Assert;

@Service
public class DataTransformer {

	@Autowired
	private CityRepository cityRepository;

	public lu.sfeir.ayed.springws.soap.Country 
				transformCountry(Country country) {
		Assert.notNull(country);
		
		lu.sfeir.ayed.springws.soap.Country  c = new lu.sfeir.ayed.springws.soap.Country();
        //set non nullable values
		c.setCode(country.getCode());
        c.setName(country.getName());
		c.setContinent(transformContinent(country.getContinent()));
		c.setRegion(country.getRegion());
		c.setSurfaceArea(country.getSurface());
		c.setPopulation(country.getPopulation());
		c.setLocalName(country.getLocalName());
		c.setGovernmentForm(country.getGovernmentForm());
        c.setCode2(country.getCode2());

        //set possible nullable values
        if (country.getIndepYear()!=null) {
            c.setIndepYear(transformIndepYear(country.getIndepYear()));
        }
        if (country.getLifeExpectancy()!=null) {
            c.setLifeExpectancy(country.getLifeExpectancy());
        }
        if (country.getGnp()!=null){
            c.setGnp(country.getGnp());
        }
        if (country.getGnpOld()!=null) {
            c.setGnpOld(country.getGnpOld());
        }
        if (country.getHeadOfState()!=null) {
            c.setHeadOfState(country.getHeadOfState());
        }
        if (country.getCityId()!=null) {
            City capital = cityRepository.findOne(country.getCityId());
            if (capital != null) {
                c.setCapital(capital.getName());
            }
        }

		return c;
	}
	
	public lu.sfeir.ayed.springws.soap.Continent 
				transformContinent(String continent) {
		Assert.notNull(continent);
        if ("africa".compareToIgnoreCase(continent)==0) {
            return Continent.AFRICA;
        }
        if ("antarctica".compareToIgnoreCase(continent)==0) {
            return Continent.ANTARCTICA;
        }
        if ("asia".compareToIgnoreCase(continent)==0) {
            return Continent.ASIA;
        }
        if ("europe".compareToIgnoreCase(continent)==0) {
            return Continent.EUROPE;
        }
        if ("north america".compareToIgnoreCase(continent)==0) {
            return Continent.NORTH_AMERICA;
        }
        if ("oceania".compareToIgnoreCase(continent)==0) {
            return Continent.OCEANIA;
        }
        if ("south america".compareToIgnoreCase(continent)==0) {
            return Continent.SOUTH_AMERICA;
        }

        return null;
	}
	
	public XMLGregorianCalendar transformIndepYear(int year) {
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime((new SimpleDateFormat("yyyy")).parse(String.valueOf(year)));
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (ParseException | DatatypeConfigurationException e) {
			Assert.isTrue(false);
			e.printStackTrace();
		} 
		
		return null;
	}


    public CityRepository getCityRepository() {
        return cityRepository;
    }

    public void setCityRepository(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
}
