package shy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import shy.model.User;
import shy.service.TestService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("/test")
    public String test(){
        String result = testService.test();
        return "使用Feign的服务消费者者--------"+result;
    }

    @RequestMapping("/testParams1")
    public String testParams1(){
        String result = testService.testParams1("zhoan",23);
        return "使用Feign的服务消费者者--------"+result;
    }

    @RequestMapping("/testParams2")
    public String testParams2(){
        User user = new User();
        user.setName("shy");
        user.setId(12);
        String result = testService.testParams2(user);
        return "使用Feign的服务消费者者--------"+result;
    }

    @RequestMapping("/testUser")
    public String testUser(){
        User result = testService.testUser();
        return "使用Feign的服务消费者者--------"+result.getId()+"-----"+result.getName();
    }

    @RequestMapping("/testList")
    public String testList(){
        List<User> result = testService.testList();
        for (User s : result){
            System.out.println(s.getName()+"---"+s.getId());
        }
        return "使用Feign的服务消费者者--------"+result;
    }
}
