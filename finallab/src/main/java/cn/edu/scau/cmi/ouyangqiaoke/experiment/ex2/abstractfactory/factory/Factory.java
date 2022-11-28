package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.factory;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.beef.Beef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.chicken.Chicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.abstractfactory.meat.pork.Pork;

public interface Factory {
    Pork producePork();
    Beef produceBeef();
    Chicken produceChicken();
}
