package shy.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义网关过滤器，继承过滤父类
 */
@Component
public class AuthFilter extends ZuulFilter {
//    当前反腐的返回值用于决定当前过滤器的类型（过滤时机）
    public String filterType() {
        //表示当前过滤器为前置，需要在转发前执行，通常用于身份认证
        return "pre";
    }

//过滤器的序号，如果有多个过滤器，看数值大小，决定先后顺序
//     返回值大，执行低，0和1先执行0
    public int filterOrder() {
        return 0;
    }

//当前过滤器是否启用，返回true表示启用，false表示不启用
    public boolean shouldFilter() {
        return true;
    }

//过滤器的具体执行方法，
//    注意返回值目前没有特殊作用，因此还有可以null
    public Object run() throws ZuulException {
        System.out.println("111111");
//获取当前对象请求上下文对象
        RequestContext context = RequestContext.getCurrentContext();
//        获取用户请求对象
        HttpServletRequest request = context.getRequest();
//        获取请求参数 token(身份令牌)
        String token= request.getParameter("token");
//        验证身份令牌
//        注意：实际工作中会进入到数据库中验证身份令牌是否合法

        if (token==null || "123".equals(token)){
            //设定false表示请求不进行转发
//            服务不转发给服务提供者
            context.setSendZuulResponse(false);
//            设置响应编码
            context.setResponseStatusCode(401);
//            设置响应类型以及编码
            context.addZuulResponseHeader("content-type","text/html;charset=utf-8");
//            设置响应内容
            context.setResponseBody("非法请求哦");
        }else {
            System.out.println("请求合法继续执行，开启下一个过滤器");
        }
        return null;
    }
}
