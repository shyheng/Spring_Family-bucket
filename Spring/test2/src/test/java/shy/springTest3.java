package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.zhishi4.Student;

import java.io.File;


public class springTest3 {

    @Test
    public void testshy(){
//        System.out.println("==========");
        String config = "zhishi4/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);

    }
}
