package shy.hystrix;

import feign.hystrix.FallbackFactory;
import shy.model.User;
import shy.service.TestService;

import java.util.List;

/**
 * 自定义异常熔断器类并实现Hystrix的降级接口提供异常熔断器
 *   注意
 *     这个父接口泛型很重要，这个泛型将决定哪个声明接口异常熔断
 */
public class MyFallbackFactory implements FallbackFactory<TestService> {
    @Override
    public TestService create(Throwable throwable) {
        //匿名内部类来创建声明试服务接口的熔断对象

        return new TestService() {
            @Override
            public String test() {
                System.out.println(throwable.getMessage());
                System.out.println(throwable.getClass());
                System.out.println(throwable.getCause());
                return "熔断"+throwable.getMessage();
            }

            @Override
            public String testParams1(String zhoan, int i) {
                return null;
            }

            @Override
            public String testParams2(User user) {
                return null;
            }

            @Override
            public User testUser() {
                return null;
            }

            @Override
            public List<User> testList() {
                return null;
            }
        };
    }
}
