package shy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import shy.hystrix.MyFallback;
import shy.hystrix.MyFallbackFactory;
import shy.model.User;

import java.util.List;

/**
 * spring会把这个接口生成一个代理对象
 *
 * fallback指定一个自定义的异常类，降级
 */
//@FeignClient(name = "7SHY-EUREKA-PROVIDER",fallback = MyFallback.class)
@FeignClient(name = "7SHY-EUREKA-PROVIDER",fallbackFactory = MyFallbackFactory.class)
public interface TestService {
    /**
     * /test一个服务的某个请求相同
     * @return
     */
    @RequestMapping("/test")
    String test();

    @RequestMapping("/testParams1")
    /**
     * 多个传参需要加注解@RequestParam
     * 如果一个就不需要加注解
     */
    String testParams1(@RequestParam String zhoan, @RequestParam int i);

    @RequestMapping("/testParams2")
    String testParams2(@RequestBody User user);

    /**
     * 返回json对象，Spring自动转换成map集合
     * @return
     */
    @RequestMapping("/testUser")
    User testUser();

    /**
     * 如果服务json数据，符合json数组，可以使用list来响应
     *
     * @return
     */
    @RequestMapping("/testList")
    List<User> testList();
}
