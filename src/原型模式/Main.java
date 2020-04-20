package 原型模式;

/**
 * @author bei
 * @create 2020-04-20-19:18
 **/
public class Main {

    public static void main(String[] args) {
        ConcretePrototype t2 = new ConcretePrototype("wer", "wc", 34);
        ConcretePrototype t3 = (ConcretePrototype) t2.clone();
        System.out.println(t2.getBean().hashCode() + "    +   " + t3.getBean().hashCode());
        /**
         *
         * 980546781    +   980546781
         */

        System.out.println(t2);

        System.out.println(t3);

        t3.setName("waoldof");
//        浅拷贝
        t3.getBean().setID("liubei");
        System.out.println(t2.getBean().getID());


        System.out.println(t2.getName());


        System.out.println("----------------------------------");

        ConcretePrototype2 t4 = new ConcretePrototype2("王一帆", "23231", 1231);

        ConcretePrototype2 t5 = (ConcretePrototype2) t4.clone();
//        深拷贝

        System.out.println(t4.getBean().hashCode() + " + " + t5.getBean().hashCode());
        /**
         * 990368553 + 1096979270
         */

    }


}
