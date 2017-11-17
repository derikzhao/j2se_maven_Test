package com.sql;


import net.sf.json.JSONArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/10/26.
 */
public class TestSql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/taix?characterEncoding=UTF-8",
                            "root", "sa12345");

            Statement s = c.createStatement();
            System.out.println("获取 Statement对象： " + s);
            String sql = "select * from track ";//limit 500

            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);

            ArrayList<ArrayList> list = new ArrayList<>();
            String temStr = "";

            int i = 0;
            while (rs.next()) {
                String id = rs.getString("Id");// 可以使用字段名
                String no = rs.getString("No");// 可以使用字段名
                String lat = rs.getString("Lat");// 可以使用字段名
                String lng = rs.getString("lng");// 可以使用字段名
                String speed = rs.getString("Speed");// 可以使用字段名
                String angle = rs.getString("Angle");// 可以使用字段名
                String time = rs.getString("Time");// 可以使用字段名
                String isload = rs.getString("Isload");// 可以使用字段名


                if (!temStr.equals(no)) {
                    // System.out.println(temStr);
                    temStr = no;

                    ArrayList<String[]> array = new ArrayList<>();
                    list.add(array);
                }

                String[] strLoc = new String[2];
                strLoc[1] = lat;
                strLoc[0] = lng;

                //获取最后一个ArrayList，添加坐标
                list.get(list.size() - 1).add(strLoc);


            }

            JSONArray jsonArray = JSONArray.fromObject(list);

            try {
                File file = new File("D:/test.txt");

                FileWriter fw = new FileWriter(file);
                String str = jsonArray.toString();

                char[] cr = str.toCharArray();

                fw.write(cr);
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (
                ClassNotFoundException e
                )

        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (
                SQLException e
                )

        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
