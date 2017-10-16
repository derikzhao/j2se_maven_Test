package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 * Created by Administrator on 2017/9/15.
 */
public class TestDate {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            Date date=new Date();

            SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );

            System.out.println(sdf.format(date));

            String str = "2016-01-05 12:12:12 111";

            try{
                Date dt=sdf.parse(str);
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }

        }
    }
}
