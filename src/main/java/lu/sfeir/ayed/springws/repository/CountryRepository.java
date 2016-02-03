package lu.sfeir.ayed.springws.repository;

import lu.sfeir.ayed.springws.domain.Country;

import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, String> {
	Country findByName(String name);
}
