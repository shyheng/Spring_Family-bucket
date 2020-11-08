package shy.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import shy.vo.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 这个类相当于servlet类
 */

@Controller
public class Mycontroller {
    /**
     * 处理方法返回String-表示逻辑视图名称
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/returnString.do")
    public String doSome(String name, Integer age){
        System.out.println("n"+name+"a"+age);
        return "show";
    }

    @RequestMapping(value = "/shy-ajax.do")
    public void doSome2(HttpServletResponse response, String name, Integer age) throws IOException {
        System.out.println("n"+name+"a"+age);

//        处理ajax请求
//        service调用无参
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        String json = "";
//        把结果对象转换为json
        if (student != null){
            ObjectMapper om = new ObjectMapper();
            json = om.writeValueAsString(student);
            System.out.println("json"+json);
        }

//        输出数据
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.print(json);
        pw.flush();
        pw.close();
    }

    /**

     处理器方法返回一个Student，通过框架转换为json，响应ajax请求
     @ResponseBody
         作用 把处理器对象返回json
      位置 方法上面。和其他注解没有顺序的关系
     */
    @ResponseBody
    @RequestMapping(value = "/shy-ajax-json.do")
    public Student doSomeAjax( String name, Integer age) {
//        调用servlet，获取
        Student student = new Student();
        student.setName("张");
        student.setAge(20);
        return student;
    }


    @ResponseBody
    @RequestMapping(value = "/shy-ajax-json.do")
    public List<Student> doSomeAjax1(String name, Integer age) {

        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("张");
        student.setAge(20);
        list.add(student);

         student = new Student();
        student.setName("张");
        student.setAge(20);
        list.add(student);

        return list;
    }

    /**
     * 处理器方法返回是string，用String表示数据，不是视图
     *
     */
    @RequestMapping(value = "/ajax-String.do",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String dao(String name,Integer age){
        return "返回对象";
    }
}
