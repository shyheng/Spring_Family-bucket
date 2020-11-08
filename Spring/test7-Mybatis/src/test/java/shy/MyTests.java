package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.dao.StudentDao;
import shy.domain.Student;
import shy.service.StudentService;

import java.util.List;

public class MyTests {
    @Test
     public void shy1() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//获取Spring容器中的dao对象
        StudentDao dao = (StudentDao) ac.getBean("studentDao");
        Student student = new Student();
        student.setId(10010);
        student.setName("s");
        student.setEmail("sshhs@");
        student.setAge(20);
        int nums = dao.insertStudent(student);
        System.out.println(nums);
    }


    @Test
    public void shy2() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//获取Spring容器中的dao对象
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(10011);
        student.setName("s2");
        student.setEmail("sshhs@2");
        student.setAge(22);
        int nums = service.addStudent(student);
        System.out.println(nums);
    }

    @Test
    public void shy3() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//获取Spring容器中的dao对象
        StudentService service = (StudentService) ac.getBean("studentService");

        List<Student> students = service.queryStudent();
        for (Student stu : students){
            System.out.println(stu);
        }
    }
}
