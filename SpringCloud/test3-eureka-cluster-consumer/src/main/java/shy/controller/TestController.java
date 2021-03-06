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
    @RequestMapping("/test")
    public String test(){
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://3SHY-EUREKA-PROVIDER/test",String.class);
        String body = responseEntity.getBody();
        return "使用eureka集群的服务消费者者"+body;
    }
}
