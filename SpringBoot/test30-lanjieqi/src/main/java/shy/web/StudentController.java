package shy.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shy.model.User;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class StudentController {

//    用户登录请求
    @RequestMapping(value = "/login")
    public @ResponseBody Object login(HttpServletRequest request){
        User user = new User();
        user.setId(520);
        user.setUsername("shy");
        request.getSession().setAttribute("user",user);
        return "login,SUCCESS";
    }

//    请求之后可以登录的
    @RequestMapping(value = "/center")
    public @ResponseBody Object sh(){
        return "see Message";
    }

//    用户不登录，也可以访问
    @RequestMapping(value = "/out")
    public @ResponseBody Object out(){
        return "out";
    }

//    登录错误,未登录访问，出现错误
    @RequestMapping(value = "/error")
    public @ResponseBody Object error(){
        return "error";
    }
}
