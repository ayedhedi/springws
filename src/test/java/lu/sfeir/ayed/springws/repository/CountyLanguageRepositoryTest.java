package lu.sfeir.ayed.springws.repository;

import lu.sfeir.ayed.springws.runnable.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * Created by ayed.h on 22/02/2016.
 */
@SpringApplicationConfiguration(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class CountyLanguageRepositoryTest {


    @Qualifier("countyLanguageRepository")
    @Autowired
    private CountyLanguageRepository languageRepository;

    @Test
    public void testGetTopSpeakingLanguage() throws Exception {
        Assert.assertNotNull(languageRepository);
    }
}