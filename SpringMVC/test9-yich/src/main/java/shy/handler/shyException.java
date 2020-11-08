package shy.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import shy.exception.AgeExcpetion;
import shy.exception.NameException;
import shy.exception.myException;

/**
 * 控制增强
 */
@ControllerAdvice
public class shyException {
//    定义方法，处理发生的异常
    @ExceptionHandler(value = NameException.class)
    public ModelAndView aa(Exception e){
        /**
         * 异常发生的处理逻辑
         *  1 需要把异常记录下来，记录到数据库 ，日志
         *    记录日志发生的时间
         *  2 发送通知，包异常的信息通过邮件发送给相关人员
         *  3 给用户有好提示
         *
         */
        ModelAndView ma = new ModelAndView();
        ma.addObject("msg","姓名不对");
        ma.addObject("ex",e);
        ma.setViewName("nameError");
        return ma;
    }



    @ExceptionHandler(value = AgeExcpetion.class)
    public ModelAndView aa1(Exception e){
        /**
         * 异常发生的处理逻辑
         *  1 需要把异常记录下来，记录到数据库 ，日志
         *    记录日志发生的时间
         *  2 发送通知，包异常的信息通过邮件发送给相关人员
         *  3 给用户有好提示
         *
         */
        ModelAndView ma = new ModelAndView();
        ma.addObject("msg","年龄不对");
        ma.addObject("ex",e);
        ma.setViewName("ageError");
        return ma;
    }

//    处理其她异常，未知的

    @ExceptionHandler
    public ModelAndView aa2(Exception e){
        ModelAndView ma = new ModelAndView();
        ma.addObject("msg","姓名不对");
        ma.addObject("ex",e);
        ma.setViewName("shy");
        return ma;
    }
}
