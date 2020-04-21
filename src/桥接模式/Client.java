package 桥接模式;

import 桥接模式.Abstract.HuaWei;
import 桥接模式.Abstract.Vivo;
import 桥接模式.Implement.FoldedPhone;
import 桥接模式.Implement.TouchingPhone;


public class Client {
    public static void main(String[] args) {

        FoldedPhone phone1 = new FoldedPhone(new HuaWei());
        FoldedPhone phone2 = new FoldedPhone(new Vivo());

        TouchingPhone phone3 = new TouchingPhone(new Vivo());

        phone1.open();
        phone1.call();
        phone1.close();


        phone3.open();
        phone2.open();


    }
}
