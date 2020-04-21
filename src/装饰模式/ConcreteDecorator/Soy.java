package 装饰模式.ConcreteDecorator;

import 装饰模式.AbstractComponent.Drink;
import 装饰模式.Decorator.Decorator;

public class Soy extends Decorator {


    public Soy(Drink drink) {
        super(drink);
        setDes("豆浆");
        setPrice(1.0f);
    }
}
