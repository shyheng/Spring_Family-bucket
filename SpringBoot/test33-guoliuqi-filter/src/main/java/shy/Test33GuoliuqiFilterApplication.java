package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import shy.filter.MyFilter;

@SpringBootApplication
@ServletComponentScan(basePackageClasses = MyFilter.class)
public class Test33GuoliuqiFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test33GuoliuqiFilterApplication.class, args);
	}

}
