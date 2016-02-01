package lu.sfeir.ayed.springws.runnable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("lu.sfeir.ayed.springws")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}