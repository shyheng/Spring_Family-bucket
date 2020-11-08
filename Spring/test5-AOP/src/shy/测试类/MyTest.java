package shy.测试类;

import shy.SomeService;
import shy.实现InvocationHandler类.MyInvocationHandler;
import shy.目标类.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyTest {
    public static void main(String[] args) {
//    调用doSome，doOther
/*        SomeService someService = new SomeServiceImpl();
        someService.doSome();
        System.out.println("==============");
        someService.doOther();*/

//     使用jdk的Proxy创建代理对象
//        创建目标类对象
        SomeService target = new SomeServiceImpl();

//        创建InvocationHandler对象
        InvocationHandler invocationHandler = new MyInvocationHandler(target);

//        使用Proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),invocationHandler);

//        通过代理执行方法，会调用InvocationHandler中的invoke（）方法
        proxy.doSome();
    }
}
