package shy.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shy.springboot.model.Student;
import shy.springboot.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student")
    public @ResponseBody Object shy(Integer id){

//        调用业务层的方法
        Student student = studentService.queryStudentId(id);

        return student;
    }
}
