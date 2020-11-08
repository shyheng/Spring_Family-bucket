package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public @ResponseBody String shy(){
        return "/user/detail";
    }

    @RequestMapping(value = "/shy")
    public @ResponseBody String shy1(){
        return "shy";
    }
}
