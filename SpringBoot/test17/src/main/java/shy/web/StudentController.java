package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import shy.model.Student;

//@Controller
@RestController //相当于控制层上类加上@Controller和@ResponseBody
//意味着当前控制层是方法都是json对象
public class StudentController {

    @RequestMapping(value = "/student")
//    @ResponseBody
    public Object shy(){
        Student student = new Student();
        student.setId(1);
        student.setName("ss");

        return student;
    }

//    该方法请求方式支持：GET和POST请求
    @RequestMapping(value = "shy",method = {RequestMethod.GET,RequestMethod.POST})
    public Object shy1(Integer id){
        Student student = new Student();
        student.setId(id);
        return student;
    }

//    @RequestMapping(value = "ss",method = RequestMethod.GET)
    @GetMapping(value = "/sss")
//    查数据库使用
    public Object ss1(){
        return "get请求";
    }

//    @RequestMapping(value = "ss",method = RequestMethod.POST)
    @PostMapping(value = "/ssss")
//    新增数据库
    public Object ss2(){
        return "post请求";
    }

//    @RequestMapping(value = "/c",method = RequestMethod.DELETE)
    @DeleteMapping(value = "/sb")
//    删除数据库
    public Object dele(){
        return "del";
    }

//    @RequestMapping(value = "/up",method = RequestMethod.PUT)
    @PutMapping(value = "/up")
//    更新使用
    public Object up(){
        return "up";
    }
}
