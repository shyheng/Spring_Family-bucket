package shy.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${webit}")
    private String websit;

    @RequestMapping(value = "/shy")
    public @ResponseBody String shy(){
        return "hello shy"+schoolName+":"+websit;
    }
}
