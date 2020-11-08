package shy.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import shy.filter.MyFilter;

@Configuration //定义为配置
public class FilterConfig {

    @Bean
    public FilterRegistrationBean shy(){
//        注册过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
//        添加过滤器路径  只能写一个*
        filterRegistrationBean.addUrlPatterns("/user/*");
        return filterRegistrationBean;
    }
}
