package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//激活EnableEurekaClient
@EnableEurekaClient
//激活zuul支持
@EnableZuulProxy
public class ZuulGateWay {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGateWay.class, args);
	}

}
