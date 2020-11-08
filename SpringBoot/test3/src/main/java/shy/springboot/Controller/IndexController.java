package shy.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/shy")
    @ResponseBody
    public String shy(){
        return "shy";
    }

    @RequestMapping(value = "/map")
    public @ResponseBody Map<String,Object> map(){
        Map<String,Object> map = new HashMap<>();
        map.put("message","springboot");
        return map;
    }
}
