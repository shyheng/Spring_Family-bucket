package shy.controller;

import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaServer
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "第一个SpringCloud的服务提供者";
    }
}
