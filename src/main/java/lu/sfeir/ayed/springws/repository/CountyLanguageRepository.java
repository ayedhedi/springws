package lu.sfeir.ayed.springws.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lu.sfeir.ayed.springws.domain.CountryLanguage;

import java.lang.annotation.Native;
import java.util.List;

public interface CountyLanguageRepository extends CrudRepository<CountryLanguage, String>{

    @Query(value= "SELECT Language, count(CountryCode) as Total FROM countrylanguage GROUP BY Language ORDER BY Total DESC",
            nativeQuery = true)
    List<Object> getTopSpeakingLanguage();

}
