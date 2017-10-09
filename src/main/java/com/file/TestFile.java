package com.file;

import java.io.*;

/**
 * Created by Administrator on 2017/9/26.
 */
public class TestFile {
    public static void main(String[] args) throws IOException {

        File file = new File("D:/test.txt");

        if (file.exists()) {
            System.out.println(file.getAbsolutePath());

            FileInputStream fs = new FileInputStream(file);

            try {
                byte[] bt = new byte[(int) file.length()];
                fs.read(bt);
                for (byte b : bt) {
                    //System.out.println(b);
                }
                String str = new String(bt, "GBK");
                System.out.println(str);
                fs.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

          /*  try {
                FileReader fr = new FileReader(file);

                char[] cr = new char[(int) file.length()];

                fr.read(cr);
                for (char c : cr) {
                   System.out.println(c);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }*/

            /*try {
                FileWriter fw = new FileWriter(file);
                String str = "testtesttesttest";

                char[] cr = str.toCharArray();

                fw.write(cr, 3, cr.length);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }*/
        }


    }
}
