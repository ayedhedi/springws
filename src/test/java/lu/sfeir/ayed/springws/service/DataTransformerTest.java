package lu.sfeir.ayed.springws.service;

import lu.sfeir.ayed.springws.domain.Country;
import lu.sfeir.ayed.springws.repository.CityRepository;
import org.databene.benerator.anno.*;
import org.databene.feed4junit.Feeder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


/**
 * Created by ayed.h on 03/02/2016.
 */
@RunWith(Feeder.class)
@Stochastic
@Database(id = "mysqlLocal", environment = "mysqlLocal")
public class DataTransformerTest {

    DataTransformer dataTransformer;
    CityRepository cityRepository;

    @Before
    public void setUp() {
        //set up data Transformer
        dataTransformer = new DataTransformer();
        //mocking the city repository ==> always returns null
        cityRepository = Mockito.mock(CityRepository.class);
        when(cityRepository.findOne(anyInt())).thenReturn(null);
        dataTransformer.setCityRepository(cityRepository);
    }


    @Test
    @Source(id = "mysqlLocal", selector = "SELECT Code, Name, Continent, Region, GovernmentForm, Population, Code2, " +
            "LocalName, Capital From country ORDER BY RAND() LIMIT 1")
    public void shouldTransformExistCountryFromDB(String code, String name,String continent,String region
            ,String governmentForm, int population,  String code2, String localName, int capital ) throws Exception {
        //given
        Country country = new Country();
        country.setCode(code);
        country.setName(name);
        country.setContinent(continent);
        country.setRegion(region);
        country.setGovernmentForm(governmentForm);
        country.setPopulation(population);
        country.setCode2(code2);
        country.setLocalName(localName);
        country.setCityId(capital);

        //when
        lu.sfeir.ayed.springws.soap.Country c = dataTransformer.transformCountry(country);

        //then
        Assert.assertNotNull(c);                                //result not null
                                                                //checks returned data
        Assert.assertNotNull(c.getCode());
        Assert.assertEquals(c.getCode(),code);
        Assert.assertNotNull(c.getName());
        Assert.assertEquals(c.getName(),name);
        Assert.assertNotNull(c.getContinent());
        Assert.assertEquals(c.getContinent().value().toLowerCase(),continent.replace(' ','_').toLowerCase());
        Assert.assertNotNull(c.getRegion());
        Assert.assertEquals(c.getRegion(),region);
        Assert.assertNotNull(c.getGovernmentForm());
        Assert.assertEquals(c.getGovernmentForm(),governmentForm);
        Assert.assertEquals(c.getPopulation(),population);
        Assert.assertNotNull(c.getCode2());
        Assert.assertEquals(c.getCode2(),code2);
        Assert.assertNotNull(c.getLocalName());
        Assert.assertEquals(c.getLocalName(),localName);
        verify(cityRepository).findOne(Matchers.eq(capital));   //mock works

    }

    @Test
    @InvocationCount(100)
    public void shouldTransformRandomCountry(@NotNull @Pattern(regexp = "[\\w]{3,8}") String code,
                                             @NotNull@Pattern(regexp = "[\\w]{3,8}") String name,
                                             @NotNull @Values({"Asia","Europe","North America","Africa","Oceania",
                                                     "Antarctica","South America"}) String continent,
                                             @NotNull @Pattern(regexp = "[\\w]{3,8}") String region,
                                             @NotNull @Pattern(regexp = "[\\w]{3,8}") String governmentForm,
                                             @Min(0) @Max(10000000) int population,
                                             @NotNull @Pattern(regexp = "[\\w]{3,8}") String code2,
                                             @NotNull @Pattern(regexp = "[\\w]{3,8}") String localName,


    int capital ) throws Exception {
        //given
        Country country = new Country();
        country.setCode(code);
        country.setName(name);
        country.setContinent(continent);
        country.setRegion(region);
        country.setGovernmentForm(governmentForm);
        country.setPopulation(population);
        country.setCode2(code2);
        country.setLocalName(localName);
        country.setCityId(capital);

        //when
        lu.sfeir.ayed.springws.soap.Country c = dataTransformer.transformCountry(country);

        //then
        Assert.assertNotNull(c);                                //result not null
        //checks returned data
        Assert.assertNotNull(c.getCode());
        Assert.assertEquals(c.getCode(),code);
        Assert.assertNotNull(c.getName());
        Assert.assertEquals(c.getName(),name);
        Assert.assertNotNull(c.getContinent());
        Assert.assertEquals(c.getContinent().value().toLowerCase(),continent.replace(' ','_').toLowerCase());
        Assert.assertNotNull(c.getRegion());
        Assert.assertEquals(c.getRegion(),region);
        Assert.assertNotNull(c.getGovernmentForm());
        Assert.assertEquals(c.getGovernmentForm(),governmentForm);
        Assert.assertEquals(c.getPopulation(),population);
        Assert.assertNotNull(c.getCode2());
        Assert.assertEquals(c.getCode2(),code2);
        Assert.assertNotNull(c.getLocalName());
        Assert.assertEquals(c.getLocalName(),localName);
        verify(cityRepository).findOne(Matchers.eq(capital));   //mock works

    }
}