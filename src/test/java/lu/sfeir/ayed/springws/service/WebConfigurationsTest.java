package lu.sfeir.ayed.springws.service;

/**
 * Created by ayed.h on 04/02/2016.
 */

import lu.sfeir.ayed.springws.runnable.Application;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestContextManager;
import org.springframework.util.Assert;
import org.springframework.ws.test.server.MockWebServiceClient;

@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(randomPort = true)
public class WebConfigurationsTest {

    @Autowired
    ApplicationContext applicationContext;

    MockWebServiceClient mockClient;

    @Before
    public void createClient() throws Exception {
        //this will avoid the use of the annotation @RunWith(SpringJUnit4ClassRunner.class)
        new TestContextManager(getClass()).prepareTestInstance(this);
        Assert.notNull(applicationContext);
        mockClient = MockWebServiceClient.createClient(applicationContext);
        Assert.notNull(mockClient);
    }

}
