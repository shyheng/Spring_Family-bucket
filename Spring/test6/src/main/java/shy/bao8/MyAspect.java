package shy.bao8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

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
     *最终通知

     @After
         特点
        1 总是执行
        2 在目标方法之后

      和finally
     *         */
    @After(value = "shy1()")
    public void shy(){
        System.out.println("执行最终通知，总是执行");

    }
    @Before(value = "shy1()")
    public void bey(){
        System.out.println("执行前置通知,在目标方法之前执行");
    }


    /**
     *  定义和管理切入点，如果你的项目中有多个切入表达式是重复的，可以服用的
     *      属性
     *        value
     *       位置 自定义方法上面
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doSecond(..))")
    public void shy1(){
//无需代码
    }
}
