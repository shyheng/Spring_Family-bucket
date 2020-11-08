package shy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    /**
     * 通过注册中心发现服务并访问服务器其中
     * 就是访问在注册中心的名称
     * SpringCloud会根据这个访问名到注册中获取服务名所对应在IP+端口号
     * 然后利RestTemplate访问服务
     *
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://SHY-EUREKA-PROVIDER/test",String.class);
        String body = responseEntity.getBody();
        return "使用eureka的服务消费者者"+body;
    }
}
