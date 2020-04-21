package 装饰模式.Decorator;

import 装饰模式.AbstractComponent.Drink;

public class Decorator extends Drink {
    /**
     * drink实现多层嵌套
     */
    private Drink obj;

    public Decorator(Drink drink) {
        this.obj = drink;

    }

    /**
     * 重写Decorator的cost方法
     *
     * @return float
     */

    @Override
    public float cost() {
        /**
         * 返回 自己(Decorator)的价格 以及  drink 的价格
         */
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        /**
         * 返回 decorator的描述信息  decorator的价格  drink的描述信息  Drink的信息
         */

        return "__________________\n" + super.getDes() + " " + super.getPrice() + "\n" + obj.getDes() +


               "\n" + "---------------";
    }


}
