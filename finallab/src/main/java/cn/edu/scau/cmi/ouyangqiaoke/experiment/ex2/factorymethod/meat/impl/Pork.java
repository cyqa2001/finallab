package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.Meat;

public class Pork implements Meat {
    public Pork() {
        System.out.println("生产-->猪肉");
    }
}
