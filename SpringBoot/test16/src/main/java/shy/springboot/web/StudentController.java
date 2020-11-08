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

    @RequestMapping(value = "/student")
    public @ResponseBody Object shy(Integer id,String name){
        Student student =new Student();
        student.setId(id);
        student.setName(name);
        int nums = studentService.updeta(student);
        return "编号"+id+"更改人数"+nums;
    }
}
