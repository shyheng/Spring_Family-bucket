package shy.bao4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
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
     *     @AfterThrowing异常通知
     *     可以有参数
     *
     *      throwing 自定义遍历，表示目标方法抛出的异常对象
     *               变量名必须和方法的参数名一样
     *
     *      特点
     *      1 在目标方法抛出异常时执行
     *      2 可以做异常的监控程序，监控目标方法执行时是不是有异常
     *         如果有，可以进行通知
     *
     *      执行是
     *       try{
     *           SomeServiceImpl.doSecond(..)
     *       }catch{
     *           MyAfter( ex)
     *       }
     *
     *         */
    @AfterThrowing(value = "execution(* *..SomeServiceImpl.doSecond(..))",
            throwing = "ex")
    public void MyAfter(Exception ex){
        System.out.println("异常通知：方法发生异常时，执行"+ex.getMessage());
//        发送邮件和通知开发人员
    }
}
