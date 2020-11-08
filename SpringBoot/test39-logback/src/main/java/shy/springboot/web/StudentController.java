package shy.springboot.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shy.springboot.model.Student;
import shy.springboot.service.StudentSerice;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    private StudentSerice studentSerice;

    @RequestMapping(value = "/student/shy")
    public @ResponseBody String shy(){

        Integer num = studentSerice.queryStudentAll();
        return "学生众人，测试log4j"+num;
    }
}
