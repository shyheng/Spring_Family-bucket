package shy.目标类;

import shy.SomeService;
import shy.工具类.serviceUtil;

import java.util.Date;


public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法some");
    }

    @Override
    public void doOther() {
        System.out.println("执行other");
    }
}
