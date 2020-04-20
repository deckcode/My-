package 原型模式;

/**
 * @author bei
 * @create 2020-04-20-19:10
 **/
public class ConcretePrototype2 implements Cloneable {

    public String name;
    public Bean2 bean;

    public ConcretePrototype2(String name, String ID, int num) {
        this.name = name;
        this.bean = new Bean2(ID, num);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bean2 getBean() {
        return bean;
    }

    public void setBean(Bean2 bean) {
        this.bean = bean;
    }

    @Override
    protected Object clone() {
        ConcretePrototype2 te = null;
        try {
            te = (ConcretePrototype2) super.clone();
//           深度拷贝： 针对引用类型特殊对待  也是clone形式复制
            te.setBean((Bean2) te.getBean().clone());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return te;
    }
}


class Bean2 implements Cloneable {
    public String ID;
    public int num;

    public Bean2(String ID, int num) {
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

    @Override
    protected Object clone() {
        Bean2 bean2 = null;
        try {
            bean2 = (Bean2) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return bean2;
    }
}