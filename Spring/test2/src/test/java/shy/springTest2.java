package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.zhishi3.Student;

import java.io.File;


public class springTest2 {

    @Test
    public void testshy(){
        System.out.println("==========");
        String config = "zhishi3/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("mystudent1");
        System.out.println(student);



        File myflie = (File) ac.getBean("myfile");
        System.out.println(myflie.getName());
    }
}
