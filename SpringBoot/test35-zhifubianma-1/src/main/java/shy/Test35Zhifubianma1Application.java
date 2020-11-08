package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import shy.servlet.MyServlet;

@SpringBootApplication
@ServletComponentScan(basePackageClasses = MyServlet.class)
public class Test35Zhifubianma1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test35Zhifubianma1Application.class, args);
	}

}
