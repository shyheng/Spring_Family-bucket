package shy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shy.service.StudentService;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/put")
    public @ResponseBody Object put(String key,String value){
        studentService.put(key,value);
        return "已经进入Redis";
    }

    @RequestMapping(value = "/get")
    public @ResponseBody String get(){
        String count = studentService.get("shy");
        return "值"+count;
    }
}
