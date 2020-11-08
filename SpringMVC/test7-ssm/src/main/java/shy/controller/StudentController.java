package shy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import shy.domain.Student;
import shy.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

//    @Resource用不了
    /**
     * 加入依赖就可以用
     */
//    自动注入
    @Resource
    private StudentService service;

//    注册学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView ma = new ModelAndView();
        String tips = "注册失败";
        //调用service处理student
        int nums = service.addStudent(student);
        if (nums> 0){
//            注册成功
            tips ="学生"+ student.getName()+"注册成功";
        }
//        添加数据
        ma.addObject("tips",tips);
        ma.setViewName("result");
        return ma;
    }


//    处理查询，响应ajax
    @ResponseBody
    @RequestMapping("/queryStudent.do")
    public List<Student> queryStudent(){
//        参数检查，简单的数据处理
        List<Student> students = service.findStudent();
        return students;
    }
}
