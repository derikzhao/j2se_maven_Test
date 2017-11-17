package com.charactor;

/**
 * Created by Administrator on 2017/8/30.
 */
public class Hero {
    public String name;
    public int hp;
    public int armor;
    public int damage;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
        //  System.out.println(name);
    }

    /*
        public void attackHero(Hero h) throws EnemyHeroIsDeadException {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (h.hp <= 0) {
                throw new EnemyHeroIsDeadException(h.name + " 已经挂了,不许要施放技能");
            } else {
                h.hp -= damge;
                System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
            }
        }*/
    public void attackHero(Hero h) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (h.hp > 0) {
            h.hp -= damage;
            System.out.format("%s 正在攻击 %s, %s的血变成了%d.%n", name, h.name, h.name, h.hp);
        }
        if (h.hp <= 0) {
            System.out.println(h.name + " 已经挂了");
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
