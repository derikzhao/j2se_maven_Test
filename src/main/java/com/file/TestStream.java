package com.file;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/9/29.
 */
public class TestStream {
    public static void main(String[] args) {

        Scanner scnIn = new Scanner(System.in);
        while (scnIn.hasNext()) {
            String str = scnIn.nextLine();

            System.out.println(str);
        }
    }
}
