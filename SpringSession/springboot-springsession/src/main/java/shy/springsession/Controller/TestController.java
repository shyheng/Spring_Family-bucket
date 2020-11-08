package shy.springsession.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @RequestMapping("/set")
    public Object set(HttpSession session){
        session.setAttribute("mykey","我的数据");
        return "Session设置成功";
    }

    @RequestMapping("/get")
    public Object get(HttpSession session){
        String data = (String) session.getAttribute("mykey");
        return data;
    }
}
