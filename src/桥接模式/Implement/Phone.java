package 桥接模式.Implement;

import 桥接模式.Abstract.Brand;

/**
 * @description Phone充当桥接作用
 **/
public abstract class Phone {
    Brand brand;

    protected Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call() {
        brand.call();
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }
}
