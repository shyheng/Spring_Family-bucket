package shy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import shy.model.User;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/getForEntity01")
    public String getForEntity01(){
/**
 * 以get方式
 */
        ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://localhost:8081/getForEntity01", User.class);
        User body = responseEntity.getBody();//获取具体响应具体参数2
        return "消费"+body;
    }

    @RequestMapping("/getForEntity02")
    public String getForEntity02(){
        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8081/getForEntity02", List.class);
        List body = responseEntity.getBody();//获取具体响应具体参数2
        return "消费"+body;
    }

    @RequestMapping("/getForEntityParams01")
    public String getForEntityParams01(){
        String url ="http://localhost:8081/getForEntityParams01?id={0}&name={1}&age={2}";
//        占位符
        Object[] params = {2L,"shy",24};
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class,params);
        User body = responseEntity.getBody();//获取具体响应具体参数2
        return "消费"+body;
    }

    @RequestMapping("/getForEntityParams02")
    public String getForEntityParams02(){
        String url ="http://localhost:8081/getForEntityParams01?id={id}&name={name}&age={age}";
//        多个数据需要参数map集合
        /**
         * 类似占位符
         */
        Map<String,Object> params = new HashMap<>();
        params.put("id",3L);
        params.put("name","shy");
        params.put("age",25);
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class,params);
        User body = responseEntity.getBody();//获取具体响应具体参数2
        return "消费"+body;
    }

    @RequestMapping("/getForObject")
    public String  getForObject(){
        String url = "http://localhost:8081/getForObject";
        User user = restTemplate.getForObject(url,User.class);
        return "消费者---"+user;
    }

    @RequestMapping("/put")
    public String  put(){
        /**
         * 参数1 以具体的请求地址路径
         */
        String url = "http://localhost:8081/getForObject";
        LinkedMultiValueMap pas = new LinkedMultiValueMap();
        pas.add("id",7L);
        pas.add("name","shy");
        pas.add("age",7);
        restTemplate.put(url,pas);
        return "消费者---执行put";
    }

    @RequestMapping("/delete")
    public String delete(){
        /**
         *
         * delete方法针对数据删除，无法获取响应结果
         */
        String url = "http://localhost:8081/delete?id={0}";
        restTemplate.delete(url,8L);
        return "消费者---执行put";
    }
}
