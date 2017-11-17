package com.lambda;

import com.charactor.Hero;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/13.
 */
public class TestLambda {
    public static void main(String[] args) {
        testAggregate();
    }

    public static void testLambda() {

    }

    public static void testAggregate() {
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 50; i++) {
            heros.add(new Hero("hero_" + i));
        }

        heros.stream()
                .filter(h -> h.hp >= 0)
                .forEach(h -> System.out.println(h.name));

    }
}
