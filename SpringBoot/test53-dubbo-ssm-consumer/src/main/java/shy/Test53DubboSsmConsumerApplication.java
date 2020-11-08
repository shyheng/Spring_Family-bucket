package shy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Test53DubboSsmConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test53DubboSsmConsumerApplication.class, args);
	}

}
