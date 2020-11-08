package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.zhishi6.Student;


public class springTest5 {

    @Test
    public void testshy(){
//        System.out.println("==========");
        String config = "zhishi6/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("mystudent");
        System.out.println(student);

    }
}
