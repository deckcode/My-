package 装饰模式.AbstractComponent;


public abstract class Drink {

    public String des;
    private float price = 0.0f;


    /**
     * 以下四个方法 会被Decorator继承重用
     */
    public String getDes() {
        return des;

    }

    public void setDes(String des1) {
        this.des = des1;

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 留给子类实现
     */

    public abstract float cost();

}
