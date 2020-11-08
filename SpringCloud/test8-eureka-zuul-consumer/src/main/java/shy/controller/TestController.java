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
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://8shy-eureka-provider/test",String.class);
        String body = responseEntity.getBody();
        return "没有使用zuul的服务消费者者"+body;
    }

    @RequestMapping("/test1")
    public String test1(){
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://8SHY-EUREKA-ZUUL/api-zuul/test",String.class);
        String body = responseEntity.getBody();
        return "使用zuul的服务消费者者"+body;
    }
}
