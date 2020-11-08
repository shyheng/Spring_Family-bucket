package shy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class MyErrorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //异常过滤器,当其他过滤器出现异常，自动执行异常
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
//        获取异常对象
        ZuulException exception = (ZuulException) context.getThrowable();
//
        HttpServletResponse response = context.getResponse();
        response.setStatus(exception.nStatusCode);
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out =null;
        try {
            out = response.getWriter();
            out.print("出现异常"+exception.nStatusCode+"----"+exception.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                out.close();
            }
        }
        return null;
    }
}
