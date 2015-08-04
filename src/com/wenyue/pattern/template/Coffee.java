package com.wenyue.pattern.template;

/**
 * 具体子类，提供了咖啡制备的具体实现
 * Created by wswenyue on 2015/8/3.
 */
public class Coffee extends  RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");

    }
}
