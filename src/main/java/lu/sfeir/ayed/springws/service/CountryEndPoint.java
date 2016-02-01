package lu.sfeir.ayed.springws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import lu.sfeir.ayed.springws.domain.GetCountryRequest;
import lu.sfeir.ayed.springws.domain.GetCountryResponse;
import lu.sfeir.ayed.springws.repository.CountryRepository;

@Endpoint
public class CountryEndPoint {
	private static final String NAMESPACE_URI = "http://sfeir.lu/guides/gs-producing-web-service";

	private CountryRepository countryRepository;

	@Autowired
	public CountryEndPoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		GetCountryResponse response = new GetCountryResponse();
		response.setCountry(countryRepository.findCountry(request.getName()));

		return response;
	}
	
}
