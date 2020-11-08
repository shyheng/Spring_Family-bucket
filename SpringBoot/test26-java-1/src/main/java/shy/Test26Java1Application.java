package shy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import shy.service.StudentService;

@SpringBootApplication
public class Test26Java1Application {

	public static void main(String[] args) {
		/**
		 * SpringBoot程序，返回值是
		 */
//		获取SpringBoot容器
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Test26Java1Application.class, args);
//		从容器中获取对象
		StudentService service = (StudentService) applicationContext.getBean("studentServiceImpl");
//		调用业务层方法
		String s = service.shy();
		System.out.println(s);
	}

}
