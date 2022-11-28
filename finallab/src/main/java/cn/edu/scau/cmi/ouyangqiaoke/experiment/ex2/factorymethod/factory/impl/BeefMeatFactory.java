package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.MeatFactory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.Meat;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.impl.Beef;

public class BeefMeatFactory implements MeatFactory {
    @Override
    public Meat produceMeat() {
        System.out.println("牛肉工厂：");
        return new Beef();
    }
}
