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
public class Apple extends Fruit {
    //构造函数
    public Apple() {
        super();
    }
    //苹果的构造函数名称，价格设为固定的
    public Apple(int fid, int couunt) {
        super(fid, "苹果", 8.8, couunt);
    }

}
