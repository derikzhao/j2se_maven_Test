package com.multiplethread;

import com.charactor.Hero;

/**
 * Created by Administrator on 2017/10/17.
 */
public class TestThread {
    public static void main(String[] args) {

        testThread1();
        //testThread2();
    }

    public static void testThread1() {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        KillHeroThread killThread1 = new KillHeroThread(gareen, teemo);
        killThread1.setPriority(Thread.MAX_PRIORITY);

        killThread1.start();
      /*  try {
            killThread1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        KillHeroThread killThread2 = new KillHeroThread(bh, leesin);
        killThread2.setPriority(Thread.MIN_PRIORITY);

        killThread2.start();

    }

    public static void testThread2() {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Thread th1 = new Thread() {
            public void run() {
                attckHero(gareen, teemo);
            }
        };
        th1.start();
    }

    public static void attckHero(Hero h1, Hero h2) {
        while (h2.hp > 0) {
            h1.attackHero(h2);
        }
    }
}
