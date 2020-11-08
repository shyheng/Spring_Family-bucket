package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "shy.servlet")
public class Test31Servlet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test31Servlet1Application.class, args);
	}

}
