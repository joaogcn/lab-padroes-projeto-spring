package one.digitalinnovation.gof;

import one.digitalinnovation.gof.factory.ServiceFactory;
import one.digitalinnovation.gof.service.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Service service = ServiceFactory.getService();
		service.performOperation();
	}
}