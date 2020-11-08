package shy.bao1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

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
     */

    /**
     * @Before前置通知
     *  属性value ，是切点表达式，表示切面的功能执行位置
     *
     *   特点
     *     1在目标方法之前先执行
     *     2 不会改变目标方法的执行结果
     *     3 不会影响目标方法的执行
     *
     */
/*
    @Before("execution(* *..SomeServiceImpl.do*(..))")
    public void myBefore(){
//        就是你要的执行的功能代码
        System.out.println("切面功能:在目标之前输出时间，" +
                "@Before前置通知，在执行dosome方法之前执行"+new Date());
    }
*/

/*    @Before("execution(* *do*(..))")
    public void myBefore1(){
//        就是你要的执行的功能代码
        System.out.println("切面功能:在目标之前输出时间，" +
                "@Before前置通知，在执行dosome方法之前执行"+new Date());
    }*/

/*    @Before("execution(* *do*(Integer))")
    public void myBefore2(){
//        就是你要的执行的功能代码
        System.out.println("切面功能:在目标之前输出时间，" +
                "@Before前置通知，在执行dosome方法之前执行"+new Date());
    }*/


/*//多个类加业务
    @Before("execution(* shy.bao1.*ServiceImpl.*(..))")
    public void myBefore1(){
//        就是你要的执行的功能代码
        System.out.println("切面功能:在目标之前输出时间，" +
                "@Before前置通知，在执行dosome方法之前执行"+new Date());
    }*/


    @Before("execution(* shy.bao1.*ServiceImpl.*(..))")
    public void myBefore1(JoinPoint jp){

//        JoinPoint jp 方法中参数
        System.out.println("方法的定义"+jp.getSignature());
        System.out.println("方法名称"+jp.getSignature().getName());
//        获取实参
        Object agr[] = jp.getArgs();
        for (Object s : agr){
            System.out.println("参数"+s);
        }
//        就是你要的执行的功能代码
        System.out.println("切面功能:在目标之前输出时间，" +
                "@Before前置通知，在执行dosome方法之前执行"+new Date());
    }
}
