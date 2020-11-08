package shy.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import shy.servlet.MyServlet;

@Configuration //配置文件
public class SystemConfig  {

    @Bean
    public FilterRegistrationBean shy(){

//       创建字符集对象
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        设置强制使用字符编码
        characterEncodingFilter.setForceEncoding(true);
//        设置指定字符编码
        characterEncodingFilter.setEncoding("utf-8");

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        设置字符编码过滤器
        filterRegistrationBean.setFilter(characterEncodingFilter);
//        设置字符编码过滤器路径
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
