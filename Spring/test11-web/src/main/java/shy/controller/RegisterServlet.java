package shy.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import shy.domain.Student;
import shy.service.StudentService;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String st = request.getParameter("id");
        String st1 = request.getParameter("name");
        String st2 = request.getParameter("email");
        String st3 = request.getParameter("age");

//        创建Spring 的容器对象
/*        String config = "Spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        System.out.println(ac);*/

        WebApplicationContext ac = null;
        ServletContext sc = getServletContext();
        ac = WebApplicationContextUtils.getRequiredWebApplicationContext(sc);


//        获取service
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.parseInt(st));
        student.setName(st1);
        student.setEmail(st2);
        student.setAge(Integer.valueOf(st3));
        service.addStudent(student);
//        给一个页面
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
