package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "使用zuul网关的服务提供者";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "使用zuul网关的服务提供者";
    }
}
