package shy.hystrix;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

/**
 * 自定义异常熔断器类，并继承Hystrix异常熔断器父类抽象类
 *
 */
public class MyHystrixCommand extends HystrixCommand {

    private RestTemplate restTemplate;
    private String url;
//    定义一个有参构造（必须的）
    public MyHystrixCommand(Setter setter,RestTemplate restTemplate,String url) {
        super(setter);
        this.restTemplate=restTemplate;
        this.url=url;
    }

    /**
     * 不能手动调用
     * @return
     * @throws Exception
     */
    protected Object run() throws Exception {
        return restTemplate.getForObject(url,Object.class);
    }

    /**
     * 服务降级方法，
     * 如果出现问题这调用这个方法
     * @return
     */
    protected Object getFallback() {
        System.out.println(super.getFailedExecutionException().getClass());
        System.out.println(super.getFailedExecutionException().getMessage());
        return "自定义熔断器废了服务";
    }
}
