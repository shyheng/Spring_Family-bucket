package shy.controller;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import shy.hystrix.MyHystrixCommand;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    /**
     *标注当前控制器方法启用Hystrix的熔断机制，当我们调用远程服务是出现异常，
     * 或超时，如果没有反应，进行熔断
     *  属性
     *    fallbackMethod 用于指定一个本地方法的名称，当服务熔断后就会调用这个方法来替代服务提供者响应
     *
     */
    @HystrixCommand(fallbackMethod = "error")
    @RequestMapping("/test")
    public String test(){
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://6shy-eureka-provider/test",String.class);
        String body = responseEntity.getBody();
        return "带有Hystrix的服务消费者者"+body;
    }

    /**
     *commandProperties 熔断器的一些属性
     * @HystrixProperty 注解用于指定一个熔断的属性
     *   execution.isolation.thread.timeoutInMilliseconds
     *    表示熔断的超时时间，如果在指定时间内没有返回则表示超时需要熔断
     *    默认1000毫秒
     *
     *    value 用于指定属性值，1500，属性名
     *
     *
     */
    @HystrixCommand(fallbackMethod = "error",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    @RequestMapping("/test1")
    public String test1(){
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://6shy-eureka-provider/test1",String.class);
        String body = responseEntity.getBody();
        return "带有Hystrix的服务消费者者"+body;
    }
//         Exception.class忽略异常，出现异常进行熔断，而是将错误直接抛出，重点是要忽略什么异常
@HystrixCommand(fallbackMethod = "error",commandProperties = {
        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
},ignoreExceptions = {AbstractMethodError.class})
    @RequestMapping("/test2")
    public String test2(){
        String str = null;
        System.out.println(str.length());
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://6shy-eureka-provider/test2",String.class);
        String body = responseEntity.getBody();
        return "带有Hystrix的服务消费者者---------"+body;
    }

    @RequestMapping("/test3")
    public String test3(){
        String url = "http://6shy-eureka-provider/test3";

        MyHystrixCommand command = new MyHystrixCommand(com.netflix.hystrix.HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("")),restTemplate,url);

        String body = (String) command.execute();
        return "带有Hystrix的服务消费者者---------"+body;
    }

    /**
     * 服务的降级方法，当我们的某个控制器方法别熔断后，就不能访问一个结果
     * 可以看见人性的看法
     * @return
     *
     * 参数1 throwable，监控的 控制器方法出现异常，就会自动熔断
     * 参数throwable就会别Spring注入一个异常对象
     */
    public String error(Throwable throwable){
        System.out.println(throwable.getClass());
        System.out.println(throwable.getMessage());
        System.out.println(throwable.getCause().getClass());
        return "服务熔断了"+throwable.getMessage();
    }
}
