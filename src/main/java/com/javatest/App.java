package com.javatest;

import com.charactor.EnemyHeroIsDeadException;
import com.charactor.Hero;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            System.out.println("驱动初始化成功");
            // Student xm = new Student();
            // xm.Name = "小明";
            // xm.ShowName();

            //  Student xh = new Student("小红");
            //  xh.ShowName();


           /* Weapon wn= new Weapon();
            wn.damage=10;
            wn.name="test";*/

            // ADHero ad=new ADHero("小小");

            int i = 3;
            Integer in = new Integer(i);
            System.out.println(in instanceof Number);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Hero a=new Hero("a");
        Hero b=new Hero("b");
        b.hp=0;

      /*  try{
            a.attackHero(b);
        }
        catch (EnemyHeroIsDeadException e)
        {
            e.printStackTrace();
        }*/

        try{
            throw new EnemyHeroIsDeadException("afd");
        }
        catch (EnemyHeroIsDeadException e)
        {
            e.printStackTrace();
        }

    }
}

