package 桥接模式.Abstract;

/**
 * @author bei
 * @create 2020-04-21-15:20
 **/
public class Vivo implements Brand {
    @Override
    public void call() {
        System.out.println("Vivo手机打电话");
    }

    @Override
    public void open() {

        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机关机");
    }
}
