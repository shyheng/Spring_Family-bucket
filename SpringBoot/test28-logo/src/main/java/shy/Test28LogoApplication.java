package shy;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test28LogoApplication {

	public static void main(String[] args) {
//		获取入口类
		SpringApplication springApplication = new SpringApplication(Test28LogoApplication.class);
//		设置他的属性
		springApplication.setBannerMode(Banner.Mode.OFF);

		springApplication.run(args);
	}


}
