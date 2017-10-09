package com.collection;

import com.charactor.ADHero;
import com.charactor.Hero;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/9/30.
 */
public class TestCollection {
    public static void main(String[] args) {
        ArrayList heroList = new ArrayList();
        heroList.add(new ADHero("Hero-1"));
        heroList.add(new ADHero("Hero-2"));

        //   heroList.set(1,new ADHero("Hero-4"));

        System.out.println(heroList);


        System.out.println(heroList.size());

        heroList.clear();
        System.out.println(heroList);

        traverseArraylist();


    }

    public static void traverseArraylist() {

        ArrayList<Hero> heros = new ArrayList<Hero>();

        for (int i = 0; i < 5; i++) {
            heros.add(new Hero("" + i));
        }

        for (int i = 0; i < heros.size(); i++) {
            Hero hero = heros.get(i);
            System.out.println(hero.name);
        }

        for (Hero h : heros) {
            System.out.println(h.name + "tt");
        }

        Iterator<Hero> it = heros.iterator();
        while (it.hasNext()) {
            Hero h = it.next();
            System.out.println(h.name + "it");
        }

    }

}
