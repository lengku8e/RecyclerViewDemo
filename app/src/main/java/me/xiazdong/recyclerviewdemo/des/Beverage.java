package me.xiazdong.recyclerviewdemo.des;

/**
 * Created by sunhailong01 on 18/1/1.
 */

public abstract class Beverage {

    String description = "unkown Beverage";

    public String getDescription() {
        return description;
    }


    public abstract double cost();

}
