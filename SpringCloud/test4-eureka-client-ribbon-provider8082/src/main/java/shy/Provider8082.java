package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//激活EnableEurekaClient
@EnableEurekaClient
public class Provider8082 {

	public static void main(String[] args) {
		SpringApplication.run(Provider8082.class, args);
	}

}
