package shy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shy.springboot.mapper.StudentMapper;

@SpringBootApplication
@MapperScan(basePackageClasses = StudentMapper.class)
@EnableDubboConfiguration  //开启 dubbo配置
public class Test52DubboSsmProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test52DubboSsmProviderApplication.class, args);
	}

}
