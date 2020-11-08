package shy.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shy.model.Student;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @RequestMapping(value = "/student")
    public Object student(Integer id,Integer age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        return student;
    }

//    @RequestMapping(value = "/s/sh/{id}/{age}")
    @GetMapping(value = "/s/sh/{id}/{age}")
    public Object shy1(@PathVariable("id") Integer id,
                       @PathVariable("age") Integer age){
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("id",id);
        retMap.put("age",age);
        return retMap;
    }
}
