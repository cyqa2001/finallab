package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.MeatFactory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.Meat;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.impl.Pork;

public class PorkMeatFactory implements MeatFactory {
    @Override
    public Meat produceMeat() {
        System.out.println("猪肉工厂：");
        return new Pork();
    }
}