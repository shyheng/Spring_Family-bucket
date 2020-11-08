package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shy.model.User;

import java.util.ArrayList;


@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        System.out.println(10/0);
        return "使用feign的服务提供者";
    }
    @RequestMapping("/testParams1")
    public String testParams1(String name,Integer age){
        return "使用feign的服务提供者"+name+"----"+age;
    }

    @RequestMapping("/testParams2")
    public String testParams2(@RequestBody User user){
        return "使用feign的服务提供者"+user.getName()+"----"+user.getId();
    }

    @RequestMapping("/testUser")
    public Object testUser(){
        User user = new User();
        user.setId(24);
        user.setName("shy");
        return user;
    }

    @RequestMapping("/testList")
    public Object testList(){
        User user = new User();
        user.setId(24);
        user.setName("shy");
        User user1 = new User();
        user1.setId(241);
        user1.setName("shy1");
        ArrayList list = new ArrayList();
        list.add(user);
        list.add(user1);
        return list;
    }
}
