package 装饰模式.ConcreteDecorator;

import 装饰模式.AbstractComponent.Drink;
import 装饰模式.Decorator.Decorator;

public class Chocolate extends Decorator {


    public Chocolate(Drink drink) {
        super(drink);
        setDes("巧克力");
        setPrice(3.0f);

    }

}
