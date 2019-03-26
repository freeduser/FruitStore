package javaoop_2.FruitStore.Manager;

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

import javaoop_2.FruitStore.podo.Apple;
import javaoop_2.FruitStore.podo.Banana;
import javaoop_2.FruitStore.podo.Fruit;
import javaoop_2.FruitStore.podo.Orange;

/**
 * 数据处理
 * 利用数组装数据
 * 对数据的增，删，改，查
 */
public class Manager {
    //新建水果数组
    public static Fruit fruits[] = new Fruit[5];
    //申明变量表示数组里的水果条数，初始化为零
     public static int counts = 0;

    //【添加数组元素】,只需要录入水果id和数量
    public static void addFruit(int i, int count) {
        if (counts < 5) {
            switch (i){
                case 1:
                fruits[counts] = new Apple(i,count);
                counts++;
                break;
                case 2:
                    fruits[counts] = new Orange(i,count);
                    counts++;
                    break;
                case 3:
                    fruits[counts] = new Banana(i,count);
                    counts++;
                    break;
                default:
                    System.out.println("商品编号为1至3！本次录入不成功！");
                    break;
            }

        }
    }

    //计算数组内商品总价
    public static double TotalCharge (){
        double charge = 0;

        for (int i = 0; i < counts; i++) {
            charge += fruits[i].getPrice()*fruits[i].getCouunt();   //单价乘数量
        }
        return charge;
    }

    //打印数组信息
    public  static String fruisIfo() {
        StringBuffer info = new StringBuffer("") ;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] !=null) {
               info.append(fruits[i].toString() + "\n")    ;
            }
        }
        return  new String(info);
    }
}
