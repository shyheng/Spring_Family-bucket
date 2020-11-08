package shy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//开启SpringBoot
@EnableDubboConfiguration//开启dubbo配置
public class Test22DubboXiaofeizheApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test22DubboXiaofeizheApplication.class, args);
	}

}
