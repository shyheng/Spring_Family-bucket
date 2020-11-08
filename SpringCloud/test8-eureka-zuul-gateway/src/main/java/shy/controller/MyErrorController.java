package shy.controller;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerException;
@Controller
public class MyErrorController implements ErrorController {
    /**
     * 当项目中的某些过滤器出现异常一会，则会自定义执行这个控制器的方法
     * 然后自动执行
     * @return
     */
    @Override
    public String getErrorPath() {
        return "/error";
    }
    @RequestMapping("/error")
    public @ResponseBody
    String error(){
        ZuulException exception = (ZuulException) RequestContext.getCurrentContext().getThrowable();
        /**
         * 使用全局异常页面，使用json格式装换
         * 但是要启动，默认异常过滤器
         */
        return "全局错误"+exception.nStatusCode+"--message---"+exception.getMessage();
    }
}
