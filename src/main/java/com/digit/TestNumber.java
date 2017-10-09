package com.digit;

/**
 * Created by Administrator on 2017/9/7.
 */
public class TestNumber {
    public static void main(String[] args) {
        int i = 5;

        //基本类型转换成封装类型
        Integer it = new Integer(i);

        int i2 = it.intValue();

        String.valueOf(i2);

        String str = "10";
        int i3 = Integer.parseInt(str);

        float f1 = 5.4f;
        System.out.println(Math.round(f1));
        System.out.println(Math.random() * 10);
        System.out.println(Math.PI);


        String a = "1";
        String name = "asfa";
        String b = "afsd";


        String format = "%s,%d,%n%s %n";

        System.out.printf(format, a, i, b);

        char c = 'a';
        Character ct = c;

        String str1 = Character.toString(c);
        String str12 = ct.toString();

        char[] crs = name.toCharArray();

        System.out.println(name.substring(1, 2));

        System.out.println(GetNum(3));


    }

    public static String GetNum(int n) {
        if (n == 0) {
            return "";
        }
        if (n % 2 == 0) {
            return GetNum((n - 2) / 2) + "2";
        } else
            return GetNum((n - 1) / 2) + "1";

    }

}

