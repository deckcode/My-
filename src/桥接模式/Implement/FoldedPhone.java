package 桥接模式.Implement;

import 桥接模式.Abstract.Brand;


public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.print("折叠式");
        super.open();
    }

    @Override
    public void call() {
        System.out.print("折叠式");
        super.call();
    }

    @Override
    public void close() {
        System.out.print("折叠式");
        super.close();
    }
}
