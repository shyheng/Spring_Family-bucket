package shy.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import shy.interceptor.UserInterceptor;

@Configuration//定义此类为配置文件（相当于之前xml）
public class InterceptorConfig implements WebMvcConfigurer {

    //    拦截器注册类
//    mvc:interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        拦截user下的
        String[] app ={
                "/user/**"
        };
//        排除不拦截的
        String[] exc ={
                "/user/out","/user/error","/user/login"
        };

//        mvc:interceptor bean calss=""
        registry.addInterceptor(new UserInterceptor()).addPathPatterns(app).excludePathPatterns(exc);
    }
}
