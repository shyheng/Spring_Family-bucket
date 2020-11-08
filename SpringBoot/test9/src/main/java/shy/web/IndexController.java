package shy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import shy.config.School;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @RequestMapping(value = "/shy")
    public @ResponseBody String shy(){
        return "name"+school.getName()+":"+school.getName();
    }
}
