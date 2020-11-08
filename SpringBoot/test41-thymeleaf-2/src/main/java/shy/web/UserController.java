package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("de","spring缓存");
        return "index";
    }

    @RequestMapping("index1")
    public ModelAndView index1(){
        ModelAndView ma = new ModelAndView();
        ma.setViewName("index");
        ma.addObject("de","spring");
        return ma;
    }
}
