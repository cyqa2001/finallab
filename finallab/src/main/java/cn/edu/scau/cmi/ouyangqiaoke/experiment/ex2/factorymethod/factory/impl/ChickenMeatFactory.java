package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.MeatFactory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.Meat;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.meat.impl.Chicken;

public class ChickenMeatFactory implements MeatFactory {
    @Override
    public Meat produceMeat() {
        System.out.println("鸡肉工厂：");
        return new Chicken();
    }
}
