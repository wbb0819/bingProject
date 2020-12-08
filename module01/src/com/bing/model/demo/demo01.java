package com.bing.model.demo;

import com.bing.model.bean.User;

import java.util.ArrayList;
import java.util.List;

public class demo01 {

    private static int numS = 0;

    public static void main(String[] args) {
        try {
            User user = new User();
            user.setId(100092);
            user.setUsername("WANGBINGBING");
            user.setPassword("zxd123");
            System.out.println(user);
            List<String> list = new ArrayList<>();
            list.add("");

            numS = 10;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String selNameById() {
        return "wangbingbing";
    }
}
