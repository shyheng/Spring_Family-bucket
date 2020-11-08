package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.bao7.SomeServiceImpl;

public class TestAOP5 {
    @Test
    public void shy(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        从容器中获取目标对象
        SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");
//        通过代理的对象执行方法，实现目标方法执行时，增加了功能
        /**
         * 目标类没有接口，使用cglib动态代理 会自动应用cglib
         */
        System.out.println(proxy.getClass().getName());
       proxy.dosome("shy",20);

    }
}
