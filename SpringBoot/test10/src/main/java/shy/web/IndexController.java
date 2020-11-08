package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping(value = "/shy")
    public ModelAndView shy(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","cao");
        modelAndView.setViewName("shy");
        return modelAndView;
    }
}
