package 装饰模式;


import 装饰模式.AbstractComponent.Drink;
import 装饰模式.ConcreteComponent.LongBlack;
import 装饰模式.ConcreteDecorator.Chocolate;
import 装饰模式.ConcreteDecorator.Milk;

public class Client {

    public static void main(String[] args) {


        Drink order = new LongBlack();
        System.out.println(order.getDes() + " " + order.getPrice() + "  " + order.cost());
        //加入一份牛奶
        order = new Chocolate(order);

        System.out.println("order加入巧克力:\n" + order.getDes() + '\n');
        System.out.println("总计： " + order.cost() + "\n\n");

        /**
         * Decorator继承Drink实现多层嵌套   加了巧克力的咖啡还是咖啡
         */
        order = new Milk(order);


        System.out.println("order加入牛奶:\n" + order.getDes() + '\n');
        System.out.println("总计： " + order.cost() + "\n\n");

        order = new Milk(order);


        System.out.println("order加入牛奶:\n" + order.getDes() + '\n');
        System.out.println("总计： " + order.cost() + "\n\n");

    }


}
