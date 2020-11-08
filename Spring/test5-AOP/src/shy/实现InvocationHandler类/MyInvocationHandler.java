package shy.实现InvocationHandler类;

import shy.工具类.serviceUtil;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        通过代理对象执行方法
        System.out.println("执行invoke方法");
        Object rse = null;
        serviceUtil.doLog();
//        执行目标类的方法，通过Method类实现
        rse = method.invoke(target,args);//Some和Other
        serviceUtil.doTrans();
        return rse;
    }
}
