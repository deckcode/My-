package 原型模式;

/**
 * @author bei
 * @create 2020-04-20-19:10
 **/
public class ConcretePrototype implements Cloneable {

    public String name;
    public Bean bean;

    public ConcretePrototype(String name, String ID, int num) {
        this.name = name;
        this.bean = new Bean(ID, num);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bean getBean() {
        return bean;
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    @Override
    protected Object clone() {
        ConcretePrototype te = null;
        try {
            te = (ConcretePrototype) super.clone();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return te;
    }
}


class Bean {
    public String ID;
    public int num;

    public Bean(String ID, int num) {
        this.ID = ID;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}