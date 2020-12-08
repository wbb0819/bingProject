package com.bing.model.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 作者：wangbingbing,
 * 创建日期：2020-12-02 15:34
 */
public class TempClass {
    public static void main(String[] args) {
        System.out.println("wangbingbing");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TempClass.main");
        System.out.println("args = " + args);
        String [] arr = new String[]{"lmt","wlj","jlx","wwj","wzz","jrr"};
        for (int i = 0; i <arr.length;i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("hanmeimei");
        for (String name : list) {
            System.out.println(name);
        }
        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(0));
        }
    }
}
