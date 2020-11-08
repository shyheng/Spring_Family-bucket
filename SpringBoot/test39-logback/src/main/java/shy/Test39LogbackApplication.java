package shy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shy.springboot.mapper.StudentMapper;

@SpringBootApplication
@MapperScan(basePackageClasses = StudentMapper.class)
public class Test39LogbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test39LogbackApplication.class, args);
	}

}
