package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//激活EurekaServer
@EnableEurekaServer
public class EurekaServer9200 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer9200.class, args);
	}

}
