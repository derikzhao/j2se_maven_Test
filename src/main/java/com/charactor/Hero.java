package com.charactor;

/**
 * Created by Administrator on 2017/8/30.
 */
public class Hero {
    public String name;
    public int hp;
    public int armor;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
        //  System.out.println(name);
    }

    public void attackHero(Hero h) throws EnemyHeroIsDeadException {
        if (h.hp == 0) {
            throw new EnemyHeroIsDeadException(h.name + " 已经挂了,不许要施放技能");
        }
    }

    // 重写toString方法
    public String toString() {
        return name;
    }


   /* private static Hero h;

    public static Hero getNewHero() {
        if (h == null) {
            h = new Hero();
        }
        return h;
    }*/
}
