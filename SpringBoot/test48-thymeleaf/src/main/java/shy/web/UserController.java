package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @RequestMapping(value = "/index")
    public String in(HttpServletRequest request, Model model){

        model.addAttribute("username","l");
        request.getSession().setAttribute("data","shy");

        return "index";
    }
}
