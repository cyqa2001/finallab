package cn.edu.scau.cmi.ouyangqiaoke.experiment.ex1.domain;

public class Goalkeeper {
    private static Goalkeeper goalkeeper;
    private String name;

    private Goalkeeper() {

    }

    public static String setGoalkeeper(String name) {
        String value;
        if(goalkeeper == null){
            goalkeeper = new Goalkeeper();
            goalkeeper.setName(name);
            System.out.println("创建守门员：" + name);
            value = "创建守门员：" + name;
        }else {
            System.out.println("已经创建了守门员：" + goalkeeper.getName() + "，不能创建守门员:" + name);
            value = "已经创建了守门员：" + goalkeeper.getName() + "，不能创建守门员:" + name;
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
