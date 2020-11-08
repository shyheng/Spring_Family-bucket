package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.bao5.SomeService;

public class TestAOP4 {
    @Test
    public void shy(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");
//        通过代理的对象执行方法，实现目标方法执行时，增加了功能

        proxy.doSecond();

    }
}
