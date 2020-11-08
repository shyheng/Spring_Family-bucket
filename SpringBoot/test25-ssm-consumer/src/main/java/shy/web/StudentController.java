package shy.web;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shy.service.StudentService;
import shy.springboot.model.Student;

@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000)
    private StudentService studentService;

    @RequestMapping("/student/detail/{id}")
    public String shy(Model model,@PathVariable("id") Integer id){
        Student student = studentService.queryStudentId(id);
        model.addAttribute("student",student);
        return "studentDetail";
    }

    @GetMapping(value = "/student/all")
    public @ResponseBody Object allStudent(){
        Integer all = studentService.queryAll();
        return "总人数"+all;
    }
}
