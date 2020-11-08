package shy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "shy.springboot.mapper")
@EnableTransactionManagement//提交事务，写不写都一样，重要的是在StudentServiceImpl实现服务上添加@Transactional
public class Test16Application {

	public static void main(String[] args) {
		SpringApplication.run(Test16Application.class, args);
	}

}
