package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.zhishi1.Student;
import shy.zhishi2.School;

import javax.xml.crypto.Data;
import java.util.Date;

public class springTest {
    @Test
    public void testshy(){
        String config = "zhishi1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

//        从容器中获取student对象
        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);
    }

    @Test
    public void testshy1(){
        String config = "zhishi1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

//        从容器中获取student对象
         Date t = (Date) ac.getBean("mytime");
        System.out.println(t);
    }

    @Test
    public void testshy2(){
        String config = "zhishi1/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = new Student();
        student.setName("z");
        student.setAge(20);
        School school = new School();
        school.setName("shy");
        school.setAddress("xili");
        student.setSchool(school);
        System.out.println(student);
    }
    @Test
    public void testshy3(){
        String config = "zhishi2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);
    }
}
