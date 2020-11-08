package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public @ResponseBody Object user(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",10);
        map.put("username","lis");
        return map;
    }

    @RequestMapping(value = "/user/page/detail")
    public String shu(Model model){
        model.addAttribute("id",520);
        model.addAttribute("username","王钰瑞");

        return "userDetail";
    }
}
