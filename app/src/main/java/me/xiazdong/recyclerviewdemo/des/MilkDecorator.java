package me.xiazdong.recyclerviewdemo.des;

/**
 * Created by sunhailong01 on 18/1/1.
 */

public class MilkDecorator extends Beverage {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "milk";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
