package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.customer;

import cn.edu.scau.cmi.ouyangqiaoke.experiment.ex2.simplefactory.factory.Factory;

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.produceMeat("Pork");
        factory.produceMeat("Beef");
        factory.produceMeat("Chicken");
    }
}
