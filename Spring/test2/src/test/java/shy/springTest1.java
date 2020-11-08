package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.zhishi2.Student;


public class springTest1 {

    @Test
    public void testshy3(){
        System.out.println("==========");
        String config = "zhishi2/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);
    }
}
