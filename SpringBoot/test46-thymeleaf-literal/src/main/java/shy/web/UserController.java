package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shy.model.User;

@Controller
public class UserController {
    @RequestMapping(value = "/zimiangliang")
    public String shy(Model model){
        model.addAttribute("shy",1);
        model.addAttribute("data","spring");
        model.addAttribute("flag",true);

        User user = new User();
        user.setId(100);
        user.setUser("wyr");
        model.addAttribute("user",user);

        User user1 = new User();
        model.addAttribute("user1",user1);

        return "literal";
    }

    @RequestMapping(value = "/splice")
    public String shy1(Model model){
        model.addAttribute("gong",120);
        model.addAttribute("dq",1);
        model.addAttribute("hy",12);
        return "splice";
    }
}
