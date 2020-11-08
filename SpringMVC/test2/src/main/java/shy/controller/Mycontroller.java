package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 这个类相当于servlet类
 */

@Controller
//模块名称
@RequestMapping("/use")
public class Mycontroller {
    /**
     * @RequestMapping ：请求映射
     *  属性 method，表示请求方式 他的值RequestMapping类枚举值
     *    get 请求 RequestMapping.GRT
     *    post 请求 RequestMapping.POST
     *
     */
//    指定用get方法
    @RequestMapping(value = "/some.do",method = RequestMethod.GET)
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","欢迎使用SpringMVC");
        mv.addObject("fun","执行doSome方法");
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = {"/shy.do"},method = RequestMethod.POST)
    public ModelAndView doSome1(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","SpringMVC");
        mv.addObject("fun","执行方法");
        mv.setViewName("shy");
        return mv;
    }

    @RequestMapping(value = {"/first.do"})
    public ModelAndView doSome2(HttpServletRequest request,
                                HttpServletResponse response,
                                HttpSession session){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","firstSpringMVC"+request.getParameter("name"));
        mv.addObject("fun","first执行方法");
        mv.setViewName("first");
        return mv;
    }
}
