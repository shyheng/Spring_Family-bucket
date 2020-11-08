package shy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("shy.springboot.mapper")
public class Test15Application {

	public static void main(String[] args) {
		SpringApplication.run(Test15Application.class, args);
	}

}
