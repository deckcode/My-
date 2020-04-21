package 桥接模式.Implement;

import 桥接模式.Abstract.Brand;

import javax.sound.midi.VoiceStatus;

public class TouchingPhone extends Phone {
    public TouchingPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.print("触屏式");
        super.open();
    }

    @Override
    public void call() {
        System.out.print("触屏式");
        super.call();

    }

    @Override
    public void close() {
        System.out.print("触屏式");
        super.close();
    }
}
