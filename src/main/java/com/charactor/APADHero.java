package com.charactor;

/**
 * Created by Administrator on 2017/8/31.
 */
public class APADHero extends Hero implements AD, AP {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
