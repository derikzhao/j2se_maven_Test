package com.exception;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Administrator on 2017/9/20.
 */
public class TestException {

    public static void main(String[] args) {

        File file = new File("");

        try {
            new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("zuihou");
        }

        //int i = 5 / 0;

        int[] j = new int[6];
        j[8] = 1;
    }
}
