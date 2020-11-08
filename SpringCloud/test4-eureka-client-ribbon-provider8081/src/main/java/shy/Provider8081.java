package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//激活EnableEurekaClient
@EnableEurekaClient
public class Provider8081 {

	public static void main(String[] args) {
		SpringApplication.run(Provider8081.class, args);
	}

}
