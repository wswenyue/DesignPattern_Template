package com.wenyue.pattern.template;

/**
 * 具体子类，提供了制备差的具体实现
 * Created by wswenyue on 2015/8/3.
 */
public class Tea extends RefreshBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("用80度的热水浸泡茶叶5分钟");
    }
}
