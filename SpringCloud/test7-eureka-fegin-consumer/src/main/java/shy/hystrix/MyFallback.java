package shy.hystrix;

import org.springframework.stereotype.Component;
import shy.model.User;
import shy.service.TestService;

import java.util.List;

/**
 * 自定义异常熔断器类，声明feign的熔断
 */
@Component
public class MyFallback implements TestService {
    @Override
    public String test() {
        return "test请求熔断";
    }

    @Override
    public String testParams1(String zhoan, int i) {
        return "test请求熔断";
    }

    @Override
    public String testParams2(User user) {
        return "test请求熔断";
    }

    @Override
    public User testUser() {
        return null;
    }

    @Override
    public List<User> testList() {
        return null;
    }
}
