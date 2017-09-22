package pf.net.api.organism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrganismApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganismApplication.class, args);
	}
}
