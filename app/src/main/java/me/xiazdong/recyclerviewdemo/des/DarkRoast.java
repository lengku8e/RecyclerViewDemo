package me.xiazdong.recyclerviewdemo.des;

/**
 * Created by sunhailong01 on 18/1/1.
 */

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
