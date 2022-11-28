package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.factory;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.meat.Meat;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.meat.impl.Beef;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.meat.impl.Chicken;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.meat.impl.Pork;

public class Factory {
    public Meat produceMeat(String meatType) {
        if(meatType.equalsIgnoreCase("Pork")) {
            return new Pork();
        }else if(meatType.equalsIgnoreCase("Beef")) {
            return new Beef();
        }else if(meatType.equalsIgnoreCase("Chicken")) {
            return new Chicken();
        }

        return null;
    }
}
