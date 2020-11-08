package shy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Controller 创建对象
 */
@Controller
/**
 * 这个类相当于servlet类
 */
public class Mycontroller {
    /**
     * 处理请求对象的SpringMVC中是使用方法来处理
     *
     * 准备dosome方法处理some.do请求
     *
     * ModelAndView
     *    Model数据   请求处理完成后，显示给用户数据
     *    view视图   jsp
     *
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
//        处理some.do请求
        ModelAndView mv = new ModelAndView();
//        添加数据
        mv.addObject("msg","欢迎使用SpringMVC");
        mv.addObject("fun","执行doSome方法");

//        视图
//        mv.setViewName("/WEB-INF/view/show.jsp");

//        当配置了视图解析器，可以使用逻辑名，指定视图
//        /WEB-INF/view/+逻辑名+.jsp
        mv.setViewName("show");

        return mv;
    }

    @RequestMapping(value = {"/oyh.do","/shy.do"})
    public ModelAndView doSome1(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","SpringMVC");
        mv.addObject("fun","执行方法");
        mv.setViewName("shy");
        return mv;
    }
}
