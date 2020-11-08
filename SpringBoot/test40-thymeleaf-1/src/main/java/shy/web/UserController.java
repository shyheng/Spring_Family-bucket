package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/user")
    public String user(Model model){

        model.addAttribute("deta","spring集成Thymeleaf模板");
        return "user";
    }
}
