package shy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 *
 */
@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/test")
    public String test(){
//        RestTemplate restTemplate = new RestTemplate();

        /**
         * getForEntity 方法 是一个get方法提交请求，服务服务器中的某一个请求对应着另一个工程的
         *  @RequestMapping("/test")
         *  参数1 需要访问的具体请求路径
         *  参数2 本次请求中返回的数据类型
         *  参数3 可变长Object
         *
         *  返回值responseEntity对象
         *  这个对象是本次请求后的响应体
         *
         */
        ResponseEntity<String > responseEntity = restTemplate.getForEntity("http://localhost:8081/test",String.class);
        System.out.println(responseEntity.getStatusCode());//获取响应的编码
        System.out.println(responseEntity.getHeaders());//获取响应头
        String body = responseEntity.getBody();//获取具体响应具体参数2
        return "第一个SpringCloud的服务消费"+body;
    }
}
