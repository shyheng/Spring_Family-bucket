package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping(value = "/user/json")
    public @ResponseBody Object use(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",520);
        map.put("user","wyr");

        return map;
    }

    @RequestMapping(value = "/user/page")
    public String shy(Model model){
        model.addAttribute("id",520);
        model.addAttribute("username","王钰瑞");

        return "userDetail";
    }

}
