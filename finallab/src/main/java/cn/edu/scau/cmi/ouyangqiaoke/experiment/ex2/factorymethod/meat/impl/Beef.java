package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.Meat;

public class Beef implements Meat {
    public Beef() {
        System.out.println("生产-->牛肉");
    }
}
