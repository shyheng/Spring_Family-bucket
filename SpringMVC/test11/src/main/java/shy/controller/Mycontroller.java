package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这个类相当于servlet类
 */

@Controller
public class Mycontroller {
    /**
     *拦截器
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView dao(String name, Integer age) {
        System.out.println("执行mav");
        ModelAndView ma = new ModelAndView();
        ma.addObject("name",name);
        ma.addObject("age",age);
        ma.setViewName("show");
       return ma;
    }


}
