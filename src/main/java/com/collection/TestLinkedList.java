package com.collection;

import com.charactor.Hero;

import java.util.LinkedList;

/**
 * Created by Administrator on 2017/10/10.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        method1();
    }

    public static void method1()
    {
        LinkedList<Hero> heros=new LinkedList<Hero>();
        heros.addLast(new Hero("11"));
        heros.addLast(new Hero("22"));
        heros.addLast(new Hero("33"));

        System.out.println(heros);
        heros.peek();
    }
}
