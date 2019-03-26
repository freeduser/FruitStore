package javaoop_2.FruitStore.UI;

import javaoop_2.FruitStore.Manager.Manager;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

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
public class FruitUI {
    private Scanner sc = new Scanner(System.in);

    //打印菜单
    public void showList() {
        System.out.println("==========水果超市==========");
        System.out.println("【1】购买苹果");
        System.out.println("【2】购买橘子");
        System.out.println("【3】购买香蕉");
//        System.out.println("【4】结账");
//        System.out.println("【5】打印小票");
//        System.out.println("【6】退出系统");
        System.out.println("============================");
    }

    /**
     * 选择水果
     * 此方法要对数组进行操作，引入mananer的Fruit【】数组
     *
     *
     */
    public void userSelect() {


        //循环选择
        boolean flag = false;   //循环控制变量
        do {
            //提示用户输入数字选择商品
            System.out.println("请输入商品编号：");
            int inp = sc.nextInt();   //输入选项
            //提示用户输入数量
            System.out.println("请输入购买数量：");
            int cout = sc.nextInt();
            //录入数据
            Manager.addFruit(inp, cout);

            //显示已经购买
            System.out.println("*********您已选择了如下商品**********");
            System.out.println(Manager.fruisIfo());

            //提示用户是否继续选择
            System.out.println("继续y/已经买好了n");
            flag = sc.next().equals("y") ? true : false;//结束循环条件
        } while (flag);


    }

    /**
     * 结账
     */
    public void PayOff() {
        //显示消费总额
        double tol = Manager.TotalCharge();  //消费总额
        System.out.println("您的消费总额为：￥" + tol);
        boolean flag = false;
        do {
            //输入用户金额
            System.out.println("请输入您的😊🙉金额：");
            double RMB = sc.nextDouble();
            //结算
            if (RMB > tol) {
                System.out.println("收您：￥" + RMB +
                        "\t消费：￥" + tol +
                        "\t找零：￥" + (RMB - tol));
            } else {
                flag = true;   //金额不足需重新输入
                System.out.println("对不起，金额不足！");
            }
        } while (flag);
    }
    //打印小票

    public void PrintList() {
        //询问用户是否需要打印小票
        System.out.println("打印小票y/不用n");
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm:ssE");
        double toltal = Manager.TotalCharge();   //double类型的计算要注意小数
        DecimalFormat df = new DecimalFormat("#0.00");
        String tol = df.format(toltal);    //返回值为string类型
        if (sc.next().equals("y")) {
            System.out.println("************欢迎光临不要钱水果摊儿************");
            System.out.println("您购买了如下商品:________________________");
            System.out.println(Manager.fruisIfo());   //商品信息
            System.out.println("总花费：￥" + df.format(toltal) );
            System.out.println("当前日期：\t\t" + sd.format(new Date()));
            System.out.println("***************************大冲分店祝您生活愉快");
        }else {
            System.out.println("************大冲分店祝您生活愉快***********");
        }
    }

}
