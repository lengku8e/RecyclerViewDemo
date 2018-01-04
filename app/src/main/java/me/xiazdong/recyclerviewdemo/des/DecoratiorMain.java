package me.xiazdong.recyclerviewdemo.des;

/**
 * Created by sunhailong01 on 18/1/1.
 */

public class DecoratiorMain {

    public static void main(String[] ar) {
        Beverage beverage = new DarkRoast();
        beverage = new MilkDecorator(beverage);

        System.out.print(beverage.getDescription() + "==="
        + beverage.cost());

        Beverage beverage1 = new HouseBland();
        beverage1 = new MilkDecorator(beverage1);


        System.out.print(beverage1.getDescription() + "==="
        + beverage1.cost());
    }
}
