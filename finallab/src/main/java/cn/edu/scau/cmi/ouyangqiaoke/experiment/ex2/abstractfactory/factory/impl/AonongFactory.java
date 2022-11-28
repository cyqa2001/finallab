package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory.Factory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.Beef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.impl.AonongBeef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.Chicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.impl.AonongChicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.Pork;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.impl.AonongPork;

public class AonongFactory implements Factory {

    @Override
    public Pork producePork() {
        return new AonongPork();
    }

    @Override
    public Beef produceBeef() {
        return new AonongBeef();
    }

    @Override
    public Chicken produceChicken() {
        return new AonongChicken();
    }
}
