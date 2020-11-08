package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import shy.model.User;

@Controller
public class UserController {
    @RequestMapping(value = "/user")
    public ModelAndView user(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1001);
        user.setAge(21);
        user.setUsername("zhang");

        modelAndView.setViewName("userDetail");
        modelAndView.addObject("user",user);

        return modelAndView;
    }

    @RequestMapping(value = "/user1")
    public String user1(Model model){
        User user = new User();
        user.setId(1002);
        user.setAge(22);
        user.setUsername("zhang12");
        model.addAttribute("user",user);
        return "userDetail";
    }

    @RequestMapping(value = "/url")
    public String url(Model model){
        model.addAttribute("id",1001);

        model.addAttribute("username","王钰瑞");
        model.addAttribute("age",19);
        return "url";
    }

    @RequestMapping(value = "/test")
    public @ResponseBody String test(String username){
        return "请求路径参数"+username;
    }

    @RequestMapping(value = "/test1")
    public @ResponseBody String test1(Integer id,String username,Integer age){
        return "请求路径参数名字"+id+"id"+username+"age"+age;
    }

    @RequestMapping(value = "/test2/{id}")
    public @ResponseBody String test2(@PathVariable("id")Integer id){

        return "id"+id;
    }

    @RequestMapping(value = "/test3/{id}/{username}")
    public @ResponseBody String test2(@PathVariable("id")Integer id,@PathVariable("username")String username){


        return "id"+id+username;
    }

    @RequestMapping(value = "/url2")
    public String ul(){
        return "url2";
    }

    @RequestMapping(value = "/property")
    public String pro(){
        return "property";
    }
}
