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

    /**
     *验证登陆的用户信息
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("我拦截你");
        String loginName = "";
//        从session获取name值
        Object attr = request.getSession().getAttribute("name");
        if (attr != null){
            loginName = (String) attr;
        }
//        判断登陆的账号，是否符合要求
        if(!"zs".equals(loginName)){
//            不能访问系统
//            给你提示
            request.getRequestDispatcher("/tips.jsp").forward(request,response);
            return false;
        }
        return true;
    }
}
