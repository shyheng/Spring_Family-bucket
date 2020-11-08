package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.bao3.SomeService;

public class TestAOP2 {
    @Test
    public void shy(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        从容器中获取目标对象
        SomeService proxy = (SomeService) ac.getBean("someService");
//        通过代理的对象执行方法，实现目标方法执行时，增加了功能

        String str = proxy.doa("shy",2);
        System.out.println(str);//环绕通过可以改变结果
    }
}
