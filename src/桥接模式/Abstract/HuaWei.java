package 桥接模式.Abstract;

/**
 * @author bei
 * @create 2020-04-21-15:21
 **/
public class HuaWei implements Brand {
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void open() {
        System.out.println("华为手机开机");

    }

    @Override
    public void close() {

        System.out.println("华为手机关机");
    }
}
