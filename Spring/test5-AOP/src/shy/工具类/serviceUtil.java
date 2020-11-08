package shy.工具类;

import java.util.Date;

public class serviceUtil {
    public static void doLog(){
        System.out.println("非业务,执行时间"+new Date());
    }
    public static void doTrans(){
        System.out.println("加非事务");
    }
}
