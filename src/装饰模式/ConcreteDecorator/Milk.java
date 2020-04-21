package 装饰模式.ConcreteDecorator;

import 装饰模式.AbstractComponent.Drink;
import 装饰模式.Decorator.Decorator;

public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
