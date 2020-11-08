package shy.controller;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shy.model.User;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/getForEntity01")
    public Object getForEntity01(){
        User user = new User(1l,"王",23);
        return user;
    }

    @RequestMapping("/getForEntity02")
    public Object getForEntity02(){
        User user = new User(1l,"王",23);
        User user1 = new User(12l,"王1",23);
        User user2 = new User(13l,"王2",23);
        User user3 = new User(133l,"王3",23);
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

    @RequestMapping("/getForEntityParams01")
    public Object getForEntityParams(User user){
        user.setName(user.getName()+"服务提供者");
        return user;
    }

    @RequestMapping("/getForEntityParams02")
    public Object getForEntityParams1(User user){
        user.setName(user.getName()+"服务提供者");
        return user;
    }

    @RequestMapping("/getForObject")
    public Object getForObject(){
        User user = new User(2L,"shy",26);
        return user;
    }

    @PutMapping("/put")
    public Object put(User user){
        user.setName((user.getName()+"服务者"));
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        return user;
    }

    @DeleteMapping("/delete")
    public Object delete(Integer id){
        System.out.println(id);
        return "删除成功";
    }

}
