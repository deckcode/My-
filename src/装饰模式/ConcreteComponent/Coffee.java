package 装饰模式.ConcreteComponent;

import 装饰模式.AbstractComponent.Drink;

public class Coffee extends Drink {


    @Override
    public float cost() {
        return super.getPrice();
    }
}
