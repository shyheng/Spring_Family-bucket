package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.ba1.Student;

public class Test1 {
    @Test
    public void shy(){
        String config = "applicationContext.xml";
        ApplicationContext ac =new  ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);
    }
}
