package lu.sfeir.ayed.springws.service;

import org.databene.benerator.anno.Database;
import org.databene.benerator.anno.InvocationCount;
import org.databene.benerator.anno.Stochastic;
import org.databene.feed4junit.Feeder;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.util.Assert;
import org.springframework.xml.transform.StringSource;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.transform.Source;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;
import static org.springframework.ws.test.server.ResponseMatchers.payload;


/**
 * Created by ayed.h on 04/02/2016.
 */
@RunWith(Feeder.class)
@Stochastic
@Database(id = "mysqlLocal", environment = "mysqlLocal")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CountryEndPointTest extends WebConfigurationsTest{


    @Test
    public void test_1_GetCountrySpain() throws Exception {
        Assert.notNull(mockClient);

        Source getCountryRequest = new StringSource(
                "<getCountryRequest xmlns='http://sfeir.lu/guides/gs-producing-web-service'>\n" +
                        "  <name>Spain</name>\n" +
                        "</getCountryRequest>\n");

        Source getCountryResponse = new StringSource(
                " <ns2:getCountryResponse xmlns:ns2=\"http://sfeir.lu/guides/gs-producing-web-service\">\n" +
                        "         <ns2:country>\n" +
                        "            <ns2:code>ESP</ns2:code>\n" +
                        "            <ns2:name>Spain</ns2:name>\n" +
                        "            <ns2:continent>EUROPE</ns2:continent>\n" +
                        "            <ns2:region>Southern Europe</ns2:region>\n" +
                        "            <ns2:surfaceArea>505992.0</ns2:surfaceArea>\n" +
                        "            <ns2:indepYear>1492+01:00</ns2:indepYear>\n" +
                        "            <ns2:population>39441700</ns2:population>\n" +
                        "            <ns2:lifeExpectancy>78.8</ns2:lifeExpectancy>\n" +
                        "            <ns2:gnp>553233.0</ns2:gnp>\n" +
                        "            <ns2:gnpOld>532031.0</ns2:gnpOld>\n" +
                        "            <ns2:localName>EspaÃ±a</ns2:localName>\n" +
                        "            <ns2:governmentForm>Constitutional Monarchy</ns2:governmentForm>\n" +
                        "            <ns2:headOfState>Juan Carlos I</ns2:headOfState>\n" +
                        "            <ns2:capital>Madrid</ns2:capital>\n" +
                        "            <ns2:code2>ES</ns2:code2>\n" +
                        "         </ns2:country>\n" +
                        "      </ns2:getCountryResponse>\n"
        );

        mockClient.sendRequest
                (withPayload(getCountryRequest)).andExpect(payload(getCountryResponse));
    }

    @Test
    @org.databene.benerator.anno.Source(id = "mysqlLocal",
            selector = "SELECT Name From country ORDER BY RAND() LIMIT 100")
    public void test_2_Get100RandomCountries(String name) throws Exception {
        Source getCountryRequest = new StringSource(
                "<getCountryRequest xmlns='http://sfeir.lu/guides/gs-producing-web-service'>\n" +
                        "  <name>"+name+"</name>\n" +
                        "</getCountryRequest>\n");

        mockClient.sendRequest
                (withPayload(getCountryRequest)).andExpect(noFault());
    }

    @Test
    @InvocationCount(100)
    public void test_3_NonExistingCountries(@NotNull @Pattern(regexp = "[\\w]{7,255}") String name) {
        Source getCountryRequest = new StringSource(
                "<getCountryRequest xmlns='http://sfeir.lu/guides/gs-producing-web-service'>\n" +
                        "  <name>"+name+"</name>\n" +
                        "</getCountryRequest>\n");

        Source getCountryResponse = new StringSource(
                " <ns2:getCountryResponse xmlns:ns2='http://sfeir.lu/guides/gs-producing-web-service' />"
        );

        mockClient.sendRequest
                (withPayload(getCountryRequest)).andExpect(noFault()).andExpect(payload(getCountryResponse));
    }

    @Test
    public void test_4_EmptyRequestContent(){
        Source getCountryRequest = new StringSource(
                "<getCountryRequest xmlns='http://sfeir.lu/guides/gs-producing-web-service'>\n" +
                        "</getCountryRequest>\n");

        Source getCountryResponse = new StringSource(
                " <ns2:getCountryResponse xmlns:ns2='http://sfeir.lu/guides/gs-producing-web-service' />"
        );

        mockClient.sendRequest
                (withPayload(getCountryRequest)).andExpect(noFault()).andExpect(payload(getCountryResponse));
    }

}