package com.wenyue.pattern.template;

/**
 * 具体子类，提供了制备茶的具体实现
 * 制备一杯中式的茶，不加柠檬
 * 复写钩子方法
 * Created by wswenyue on 2015/8/3.
 */
public class TeaNotAdd extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    /**
     * 复写钩子方法
     * */
    @Override
    protected boolean isCustomerWantsConiments() {
        return false;
    }

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }
}
