package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsreController {
    @RequestMapping(value = "/operator")
    public String shy(Model model){
        model.addAttribute("sex",1);
        model.addAttribute("flag",true);
        return "operator";
    }
}
