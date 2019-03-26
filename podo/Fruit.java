package javaoop_2.FruitStore.podo;

/**
 * 类描述了
 * <p>
 * <p>
 * <p>
 * 修改时间： 2019/3/26
 *
 * @author shenyingming tel:18076220793
 * @version 1.0 <br>
 */

import java.util.Objects;

/**
 *水果类的父类
 */
public class Fruit {
    private  int Fid;
    private String name;
    private double price;
    private int couunt;
    /*   构造函数    */
    public Fruit() {
    }

    public Fruit(int fid, String name, double price, int couunt) {
        Fid = fid;
        this.name = name;
        this.price = price;
        this.couunt = couunt;
    }

    /*   getter() and setter()  */

    public int getFid() {
        return Fid;
    }

    public void setFid(int fid) {
        Fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCouunt() {
        return couunt;
    }

    public void setCouunt(int couunt) {
        this.couunt = couunt;
    }

    @Override
    public String toString() {
        return "商品编号 "+ Fid +
                "\t商品名称: " + name +
                "\t商品价格： " + price +
                "\t商品数量： " + couunt;

    }

    //判断两个水果是否相等，不用比较数量
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return  Double.compare(fruit.price, price) == 0 &&
                Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Fid, name, price, couunt);
    }
}
