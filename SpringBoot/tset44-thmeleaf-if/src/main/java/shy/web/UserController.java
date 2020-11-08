package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/if")
    public String shy(Model model){

        model.addAttribute("sex",1);
        model.addAttribute("s",true);
        model.addAttribute("sh",0);

        return "condition";
    }
}
