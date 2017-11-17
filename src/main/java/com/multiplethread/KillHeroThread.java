package com.multiplethread;

import com.charactor.Hero;

/**
 * Created by Administrator on 2017/10/17.
 */
public class KillHeroThread extends Thread {
    private Hero h1;
    private Hero h2;

    public  KillHeroThread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }

    public  void run()
    {
        while (h2.hp>0)
        {
            h1.attackHero(h2);
        }
    }
}
