package shy.web;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shy.service.StudentService;
import shy.springboot.model.Student;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000,check = false)
    private StudentService studentService;

    @RequestMapping(value = "/student/detail/{id}")
    public String student(Model model, @PathVariable("id")Integer id){

//        根据学生id查询
        Student student = studentService.queryId(id);

        model.addAttribute("student",student);

        return "studentDetail";
    }
}
