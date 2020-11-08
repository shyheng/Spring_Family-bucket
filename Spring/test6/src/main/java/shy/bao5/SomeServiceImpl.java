package shy.bao5;

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

    @Override
    public String doa(String name, Integer age) {
        System.out.println("环绕通知");
        return "shy";
    }

    @Override
    public void doSecond() {
        System.out.println("执行业务方法，异常"+(10/0));
    }


}
