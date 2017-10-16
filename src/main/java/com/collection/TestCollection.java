package com.collection;

import com.charactor.Hero;

import java.util.*;

/**
 * Created by Administrator on 2017/9/30.
 */
public class TestCollection {
    public static void main(String[] args) {

        // traverseArraylist();

        testHashMap();
        testArrayList();
       // testHashSet();
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


    public static void testHashMap() {
        HashMap<String, Hero> hm = new HashMap<String, Hero>();

        /*hm.put("aa", new Hero("aa"));
        hm.put("aa", new Hero("bb"));

        System.out.println(hm);*/
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 300000; i++) {
            hm.put("" + i, new Hero("hero-" + getRandom()));
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("HashMap添加耗时：" + (timeEnd - timeStart));

        //查询
        long timeStart2 = System.currentTimeMillis();
        Hero a = hm.get("5555");
        long timeEnd2 = System.currentTimeMillis();
        System.out.println("HashMap查询耗时：" + (timeEnd2 - timeStart2));

        // System.out.println(hm);
    }

    public static void testArrayList() {
        ArrayList<Hero> hm = new ArrayList<Hero>();
        long timeStart = System.currentTimeMillis();

        for (int i = 0; i < 300000; i++) {
            hm.add(new Hero("hero-" + getRandom()));
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("ArrayList添加耗时：" + (timeEnd - timeStart));
        // System.out.println(hm);
    }

    public static int getRandom() {
        return new Random().nextInt(1000) + 1000;
    }

    public static void testHashSet() {
        HashSet<String> hs = new HashSet<String>();
        hs.add("11");
        hs.add("22");

        System.out.println(hs.contains("11"));
        hs.add("11");
        System.out.println(hs);

        // HashMap<int,String>
    }
}
