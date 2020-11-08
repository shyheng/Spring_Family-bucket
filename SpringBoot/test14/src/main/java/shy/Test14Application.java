package shy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "shy.springboot.mapper")//开启扫描器
public class Test14Application {

	public static void main(String[] args) {
		SpringApplication.run(Test14Application.class, args);
	}

}
