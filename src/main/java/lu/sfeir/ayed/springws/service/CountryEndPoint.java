package lu.sfeir.ayed.springws.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import lu.sfeir.ayed.springws.soap.GetCountryRequest;
import lu.sfeir.ayed.springws.soap.GetCountryResponse;
import lu.sfeir.ayed.springws.repository.CountryRepository;


@Endpoint
public class CountryEndPoint {
    private static final Logger logger = Logger.getLogger(CountryEndPoint.class.getSimpleName());
    private static final String NAMESPACE_URI = "http://sfeir.lu/guides/gs-producing-web-service";


	@Autowired
	private DataTransformer dataTransformer;
	@Autowired
	private CountryRepository countryRepository;


	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        logger.info("Got a SOAP Request get country:" +request.getName());
		GetCountryResponse response = new GetCountryResponse();
		lu.sfeir.ayed.springws.domain.Country country = countryRepository.findByName(request.getName());

		if (country != null) {
            logger.info("Country found in DB: transform the object !!");
			response.setCountry(dataTransformer.transformCountry(country));
		}else {
            logger.info("Cannot find country name="+request.getName());
        }

		return response;
	}
	
}
