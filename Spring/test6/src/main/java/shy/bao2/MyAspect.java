package shy.bao2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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
     *
     *    @AfterReturning 后置通知
     *     有参数推荐Object，参数名自定义
     *
     *     属性 1 value 切入表达式
     *         2 returning 自定义的变量和目标的一样
     *
     *    特点  1 在目标方法后执行，能够获取目标方法的返回值
     *        3可以修改返回值
     */
    @AfterReturning(value = "execution(* *..SomeServiceImpl.doother(..))",
    returning = "res")
      public void myAf(JoinPoint jp,Object res) {
//        JoinPoint jp必须在第一个，不然出异常
//        Object res是目标方法执行后 返回值
        System.out.println("后置通知，在目标方法后执行，获取返回值"+res);
        if ("shy".equals(res)){
//            做功能
        }else {
//            其他功能
        }

/*
//        修改目标的返回值,是否会影响，最后的调用
        if (res != null){
            res = "hell";
        }

        没用改不了
*/


      }
}
