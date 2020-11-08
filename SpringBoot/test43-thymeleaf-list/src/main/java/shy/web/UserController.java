package shy.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import shy.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping(value = "/each")
    public String shy(Model model){
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(520+i);
            user.setNick("王钰瑞"+i);
            user.setPhone("1314"+i);
            user.setAddress("sj"+i);
            userList.add(user);
        }
        model.addAttribute("userList",userList);
        model.addAttribute("data","springboot");
        return "eachList";
    }
    @RequestMapping(value = "/each/map")
    public String shy1(Model model){
        Map<Integer,Object> map = new HashMap<Integer, Object>();

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(520+i);
            user.setNick("王钰瑞"+i);
            user.setPhone("1314"+i);
            user.setAddress("sj"+i);
            map.put(i,user);
        }

        model.addAttribute("userMap",map);

        return "eachMap";
    }

    @RequestMapping(value = "/each/array")
    public String shy2(Model model){
        User[] users = new User[10];

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(520+i);
            user.setNick("王钰瑞"+i);
            user.setPhone("1314"+i);
            user.setAddress("sj"+i);
            users[i] = user;
        }

        model.addAttribute("userArray",users);

        return "eachArray";
    }


    @RequestMapping(value = "/each/all")
    public String shy3(Model model){
       List<Map<Integer,List<User>>> mylist = new ArrayList<Map<Integer, List<User>>>();
        for (int i = 0; i < 10; i++) {
            Map<Integer,List<User>> map = new HashMap<Integer, List<User>>();
            for (int j = 0; j < 10; j++) {
                List<User> my = new ArrayList<User>();
                for (int k = 0; k < 10; k++) {
                    User user = new User();
                    user.setId(520+k);
                    user.setNick("王钰瑞"+k);
                    user.setPhone("1314"+k);
                    user.setAddress("数字 i"+i);
                    my.add(user);
                }
                map.put(j,my);
            }
            mylist.add(map);
        }

        model.addAttribute("myAll",mylist);

        return "eachAll";
    }
}
