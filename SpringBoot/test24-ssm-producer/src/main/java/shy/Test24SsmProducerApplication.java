package shy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "shy.springboot.mapper")
@EnableDubboConfiguration
public class Test24SsmProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test24SsmProducerApplication.class, args);
	}

}
