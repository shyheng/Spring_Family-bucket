package shy.bao3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

/**
 * @Aspect 表示当前类是切面类
 *         切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码
 *         位置 在类的上面
 *
 */
@Aspect
public class MyAspect {
    /**
     * 定义方法 方法是实现切面功能的
     *  要求
     *      1 公共
     *      2没有返回值
     *      3 方法名称自定义
     *      4 方法可以有参数，也可以没有
     *       如果有参数，不是自定义，有几个参数类型可以使用
     *
     *
     *     环绕通知
     *     有参数，固定ProceedingJoinPoint pjp
     *
     *     属性 1 value 切入表达式
     *         2 returning 自定义的变量和目标的一样
     *
     *    特点  1 功能最强的通知
     *         2 前后都可以增强
     *          3 控制目标方法是否被调用
     *         4 修改原来的参数
     *
     *    环绕通过等同于jdk的动态代理
     *
     *    参数：ProceedingJoinPoint pjp等同于Method
     *
     *    返回值  就是目标方法的执行结果，可以被修改
     *
     *    环绕通知 经常做事务，在目标方法之前开启事务，执行目标方法，在目标方法之后提交事务
     */

@Around(value = "execution(* *..SomeServiceImpl.doa(..))")
    public Object myss(ProceedingJoinPoint pjp) throws Throwable {
//    获取第一个参数值
    String name=" ";
    Object agrs[] =  pjp.getArgs();
    if (agrs !=  null && agrs.length >1){
        Object arg =  agrs[0];
        name = (String)arg;
    }
//        环绕通知
    Object result = null;
    System.out.println("环绕通知，在目标方法前时间"+new Date());
//    1方法调用
    if ("shy".equals(name)){
        result =  pjp.proceed();// rse = method.invoke(target,args);
    }

    System.out.println("环绕通知，执行后"+new Date());
//    2 在目标方法的前后加入功能

//    修改目标方法的执行结果，影响方法最后的调用
    if (result != null){
        result = "hello AOP";
    }


//    返回执行结果
    return result;
    }

}
