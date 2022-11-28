package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.customer;


import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.impl.BeefMeatFactory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.impl.ChickenMeatFactory;
import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.factorymethod.factory.impl.PorkMeatFactory;

public class Customer {
    public static void main(String[] args) {
        PorkMeatFactory porkMeatFactory = new PorkMeatFactory();
        porkMeatFactory.produceMeat();

        System.out.println();

        BeefMeatFactory beefMeatFactory = new BeefMeatFactory();
        beefMeatFactory.produceMeat();

        System.out.println();

        ChickenMeatFactory chickenMeatFactory = new ChickenMeatFactory();
        chickenMeatFactory.produceMeat();
    }
}
