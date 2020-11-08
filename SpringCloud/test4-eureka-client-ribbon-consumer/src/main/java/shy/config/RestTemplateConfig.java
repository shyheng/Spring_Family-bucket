package shy.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    /**
     * 注解用于标记当前的restTemplate使用ribbon的负载均衡
     * 当前使用了Eureka注册中心后必须使用这个注解否则无法正常获取服务，默认
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 定义Ribbon负载均衡的bean配置，用于改变Ribbon的默认负载均衡
     *
     * @return
     */
    @Bean
    public IRule iRule(){
//        创建一个随机的Ribbon的负载均衡策略，默认轮询
        return new RandomRule();
    }
}
