package shy.ba1;

import org.springframework.stereotype.Component;

/**
 * @Component 创建对象的，等同于<bean>功能
 *    属性 value 就是对象的名称，也就是bean的id值
 *    value属性是唯一的，创建的对象在整个Spring容器就一个
 *
 *   spring中和@Component功能一致，创建对象的注解有
 * 1 @Repository（持久层） : 放在dao的实现类上面，表示创建dao对象，dao对象是能访问数据库
 * 2 @service（用在业务层类上面的）：放在service的实现类上面，创建service对象，series对象，可以有事务等功能的
 * 3 @Controller（控制器上）：放在控制器类的上面，创建控制器对象的，控制对象，能够接受用户提交的参数，显示处理结果
 *
 * 以上三个注解的使用语法和 @Component一样，但是还有其他功能
 *给项目分层
 */
//@Component(value = "mystudent")
@Component("mystudent")
//    默认首字母小写 value值 student
//@Component
public class Student {
    private String name;
    private Integer age;

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
                '}';
    }
}
