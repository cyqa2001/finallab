package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.Meat;

public class Chicken implements Meat {
    public Chicken() {
        System.out.println("生产-->鸡肉");
    }
}
