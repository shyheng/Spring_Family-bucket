package shy.Handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 拦截器类
 */
public class MyInterceptor implements HandlerInterceptor {
   private long btime = 0;
    /**
     *预处理方法
     *   Object handler被拦截的对象
     *
     *   特点 方法在控制器方法之前执行
     *   用户请求先到这
     *
     *   这个可以验证用户是否登录
     *   等同于验票
     *
     * 重点
     *   return true  请求可以被处理
     *   return false 访问就拦截，请求到此方法就截止
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       btime = System.currentTimeMillis();
        System.out.println("拦截你");
//        给浏览器一个返回结果
//        request.getRequestDispatcher("/tips.jsp").forward(request,response);
        return true;
    }

    /**
     *
     * 后处理方法
     *    Object handler, 被拦截器拦截的对象
     *    ModelAndView modelAndView 处理方法的返回值
     *
     *    主要是可以对原来执行结果做二次修正
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("后处理");
//        更改原来的值
        if ( modelAndView != null){
//            修改
            modelAndView.addObject("my",new Date());
//            修改视图
            modelAndView.setViewName("other");
        }
    }

    /**
     *最后执行方法
     * Object handler, 拦截对象
     * Exception ex 程序中发生的异常
     *
     * 特点
     *    在请求处理完成后执行。但视图完成后，执行
     *    一般做资源回收，
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("最后一个");
        long etim = System.currentTimeMillis();
        System.out.println("耗时"+(etim-btime));
    }
}
