package shy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shy.service.BuyGoodsService;

public class MyBuy {
    @Test
    public void shy(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
//        从容器中获取的对象
        BuyGoodsService service = (BuyGoodsService) ac.getBean("buyService");
        service.buy(1001,10);
    }
}
