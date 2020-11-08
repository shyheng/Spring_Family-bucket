package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import shy.servlet.MyServlet;

@SpringBootApplication
@ServletComponentScan(basePackageClasses = MyServlet.class)
public class Test36CharacterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test36CharacterApplication.class, args);
	}

}
