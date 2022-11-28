package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory.Factory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.Beef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.impl.WensBeef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.Chicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.impl.WensChicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.Pork;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.impl.WensPork;

public class WensFactory implements Factory {
    @Override
    public Pork producePork() {
        return new WensPork();
    }

    @Override
    public Beef produceBeef() {
        return new WensBeef();
    }

    @Override
    public Chicken produceChicken() {
        return new WensChicken();
    }
}
