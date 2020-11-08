package shy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shy.service.StudentService;

@SpringBootApplication
public class Test27Java2Application implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
//		SpringBoot启动程序，会初始化Spring值
		SpringApplication.run(Test27Java2Application.class, args);
	}

//	重写run方法
	@Override
	public void run(String... args) throws Exception {
//		调用业务层方法
		String  s = studentService.shy("王钰瑞");
		for (int i = 0; i <10 ; i++) {
			System.out.println(s);
		}
		System.out.println(s);
	}
}
