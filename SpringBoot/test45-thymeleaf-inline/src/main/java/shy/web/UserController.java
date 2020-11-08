package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping(value = "/inline")
    public String shy(Model model){
        model.addAttribute("shy","spring");
        return "inline";
    }
}
