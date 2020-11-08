package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import shy.vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 这个类相当于servlet类
 */

@Controller
public class Mycontroller {
    @RequestMapping(value = "/receiveproperty.do")
    public ModelAndView doSome(String name,Integer age){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",name);
        mv.addObject("myage",Integer.valueOf(age));
        mv.setViewName("show");
        return mv;
    }

    /**
     * 参数名和请求名不一样
     @RequestParam 属性
                       value 请求参数名
                  2 required 是一tf 数据 有没有可以访问 如果是t 没有参数就访问不了
     */
    /**
     处理器方法形参是java对象，这个对象的属性名和请求参数的名是一样的
      框架会调用set方法
     */
    @RequestMapping(value = "/shy1.do")
//    对象接受
    public ModelAndView shy(Student myStudent){
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname",myStudent.getName());
        mv.addObject("myage",myStudent.getAge());
        mv.addObject("student",myStudent);
        mv.setViewName("show");
        return mv;
    }

}
