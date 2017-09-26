package com.file;

import java.io.File;

/**
 * Created by Administrator on 2017/9/26.
 */
public class TestFile {
    public static void main(String[] args) {

        File file = new File("D:/test.txt");

        if (file.exists()) {
            System.out.println(file.getAbsolutePath());
        }
    }
}
