package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.PublicKey;
import java.util.Date;

public class TestSpring {
    @Test
    public void test(){
        SomeServlet someServlet = new SomeServletImpl();
        someServlet.doSome();
    }

    @Test
    public void test1(){
//        使用Spring容器创建创建对象
//        1指定Spring配置文件的名称
        String config = "beans.xml";
//        创建表示Spring容器的对象ApplicationContext
//        ApplicationContext就表示，通过容器获取对象
//        ClassPathXmlApplicationContext表示从类路径中加载Spring的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

//        获取某个对象，调用方法
//        getBean("someServlet")放配置文件中的id
        SomeServlet someServlet = (SomeServlet) ac.getBean("someServlet");
        someServlet.doSome();
    }

    @Test
    public void shy(){
        String cong = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(cong);
//        使用类
//        调用无参构造方法
        Date my = (Date) ac.getBean("shy");
        System.out.println(my);
    }
}
