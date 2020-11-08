package shy.ba3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("mystudent")
public class Student {
    /**
     * @Value：简单类注解
     *   属性 ：value是String
     *     位置  1在属性上定义
     *           2 在set方法上定义
     */
    @Value("张")
    private String name;
    @Value("20")
    private Integer age;

//    引用类型
    /**
     * @Autowired :spring提供的注解,实现引用类型的注解
     * 使用自动注入原理，支持byName和byType
     *
     *     位置 1 在属性定义的上面，无需set方法，推荐使用
     *         2 在set方法上
     *
     *
     *   如果使用byName方式，
     *        1在属性上面加@Autowired
     *        2 在属性上面加@Qualifier("加bean的id")
     *
     *   没有先后顺序
     */
    @Autowired
    @Qualifier("myschool")
    private School school;

    public Student() {
        System.out.println("无参");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
