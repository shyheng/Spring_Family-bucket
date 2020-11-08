package shy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import shy.exception.AgeExcpetion;
import shy.exception.NameException;
import shy.exception.myException;
import shy.vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 这个类相当于servlet类
 */

@Controller
public class Mycontroller {
    /**
     *
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView dao(String name, Integer age) throws myException {
        ModelAndView ma = new ModelAndView();
        /*根据请求参数抛出异常*/
        if (!"zs".equals(name)){
            throw new NameException("名不对");
        }
        if (age==null || age>80){
            throw new AgeExcpetion("年龄不对");
        }
        ma.addObject("name",name);
        ma.addObject("age",age);
        ma.setViewName("show");
       return ma;
    }


}
