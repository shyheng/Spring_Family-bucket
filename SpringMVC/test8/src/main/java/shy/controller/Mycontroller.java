package shy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
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
     *处理器方法返回ModelAndView，实现转发forward
     * 语法 setViewName（“forward：视图文件完整路径”）
     * 特点，不和视图解析器一同使用
     */
    @RequestMapping(value = "/doForward.do")
    public ModelAndView dao(String name, Integer age){
        ModelAndView ma = new ModelAndView();
        ma.addObject("name",name);
        ma.addObject("age",age);
//        显示转发
//        ma.setViewName("forward:/WEB-INF/view/show.jsp");
        ma.setViewName("forward:/hell.jsp");
        //可以不用受解析器的局限
//        可以调到任何地方
       return ma;
    }

    /**
     * 处理器方法返回ModelAndView，实现重定向redirect
     * 语法setViewName（“redirect：视图完整路径”）
     * 特点 不和视图解析器一同使用
     *
     * ${param}获取请求参数
     *
     * redirect不能访问静态WEB-INF
     */
    @RequestMapping(value = "/doRedirect.do")
    public ModelAndView dao1(String name, Integer age){
        ModelAndView ma = new ModelAndView();
//        放到request作用域中
        ma.addObject("name",name);
        ma.addObject("age",age);
        ma.setViewName("redirect:/hell.jsp");
        return ma;
    }
}
