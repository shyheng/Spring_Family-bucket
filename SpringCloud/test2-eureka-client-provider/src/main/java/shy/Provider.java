package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//激活EnableEurekaClient
@EnableEurekaClient
public class Provider {

	public static void main(String[] args) {
		SpringApplication.run(Provider.class, args);
	}

}
