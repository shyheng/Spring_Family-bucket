package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//激活EurekaServer
@EnableEurekaServer
public class EurekaServer9100 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer9100.class, args);
	}

}
