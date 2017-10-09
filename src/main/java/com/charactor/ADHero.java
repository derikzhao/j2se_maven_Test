package com.charactor;

/**
 * Created by Administrator on 2017/8/31.
 */
public class ADHero extends Hero implements AD {
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

    public ADHero(String name) {
        super(name);
        //System.out.println(this.name);
    }
}
