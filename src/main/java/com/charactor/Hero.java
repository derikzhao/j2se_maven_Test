package com.charactor;

/**
 * Created by Administrator on 2017/8/30.
 */
public class Hero {
    public String name;
    public String hp;
    public int armor;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
        System.out.println("父类：" + name);
    }
   /* private static Hero h;

    public static Hero getNewHero() {
        if (h == null) {
            h = new Hero();
        }
        return h;
    }*/
}
