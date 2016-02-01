package lu.sfeir.ayed.springws.service;


import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ClassUtils;
import org.springframework.ws.client.core.WebServiceTemplate;

import lu.sfeir.ayed.springws.domain.GetCountryRequest;
import lu.sfeir.ayed.springws.runnable.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(randomPort = true)
public class ApplicatonTests {

	private Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

	private int port = 8080;

	@Before
	public void init() throws Exception {
		marshaller.setPackagesToScan(ClassUtils.getPackageName(GetCountryRequest.class));
		marshaller.afterPropertiesSet();
	}

	@Test
	public void testSendAndReceive() {
		GetCountryRequest request = new GetCountryRequest();
		request.setName("Spain");
		assertNotNull(new WebServiceTemplate(marshaller).marshalSendAndReceive("http://localhost:"+ port + "/ws", request));
	}
	
}
