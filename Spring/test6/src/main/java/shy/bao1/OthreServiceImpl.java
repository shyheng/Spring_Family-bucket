package shy.bao1;

public class OthreServiceImpl implements SomeService {

    @Override
    public void dosome(String name, Integer age) {
//        给dosoem方法增加一个功能，在dosome方法 之前增加时间
        System.out.println("执行dsme方法");
    }

    @Override
    public void doohter(String name, Integer age) {
//        给dosoem方法增加一个功能，在dosome方法 之前增加时间
        System.out.println("执行s方法");
    }
}
