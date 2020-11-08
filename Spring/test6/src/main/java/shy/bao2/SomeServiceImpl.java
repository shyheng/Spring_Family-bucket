package shy.bao2;

public class SomeServiceImpl implements SomeService {

    @Override
    public void dosome(String name, Integer age) {
//        给dosoem方法增加一个功能，在dosome方法 之前增加时间
        System.out.println("执行doSome方法");
    }

    @Override
    public String doother(String name, Integer age) {
        System.out.println("doother方法");
        return "shy";
    }


}
