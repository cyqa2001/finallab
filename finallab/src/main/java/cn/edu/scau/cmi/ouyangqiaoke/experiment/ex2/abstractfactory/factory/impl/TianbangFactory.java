package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory.impl;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory.Factory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.Beef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.impl.TianbangBeef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.Chicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.impl.TianbangChicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.Pork;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.impl.TianbangPork;

public class TianbangFactory implements Factory {
    @Override
    public Pork producePork() {
        return new TianbangPork();
    }

    @Override
    public Beef produceBeef() {
        return new TianbangBeef();
    }

    @Override
    public Chicken produceChicken() {
        return new TianbangChicken();
    }
}
