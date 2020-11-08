package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        System.out.println(10/0);
        return "带有熔断器的服务提供者";
    }

    @RequestMapping("/test1")
    public String test1(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "带有熔断器的服务提供者";
    }

    @RequestMapping("/test2")
    public String test2(){
        return "带有熔断器的服务提供者3";
    }

    @RequestMapping("/test3")
    public String test3(){
        System.out.println(10/0);
        return "带有熔断器的服务提供者3";
    }
}
