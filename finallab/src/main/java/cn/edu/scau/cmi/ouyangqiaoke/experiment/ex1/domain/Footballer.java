package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex1.domain;

import java.util.ArrayList;
import java.util.List;

public class Footballer {
    private static List<Footballer> footballers = new ArrayList<>();
    private static int quantity = 10;
    private String name;

    private Footballer() {

    }

    public static String addFootballer(String name) {
        String value;
        if(footballers.size() < quantity) {
            Footballer footballer = new Footballer();
            footballer.setName(name);
            footballers.add(footballer);
            System.out.print("当前已添加的球员共" + footballers.size() + "个，名单是：");
            value = "当前已添加的球员共" + footballers.size() + "个，名单是：";
            for (int i = 0; i < footballers.size(); i++){
                System.out.print(footballers.get(i).getName() + ";");
                value += footballers.get(i).getName() + ";";
            }
            System.out.println();
            value += "\n";
        }else {
            System.out.println("已经创建了10个球员，不能再添加新的球员了：" + name);
            value = "已经创建了10个球员，不能再添加新的球员了：" + name;
        }
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}















