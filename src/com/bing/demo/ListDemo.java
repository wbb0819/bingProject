package com.bing.demo;

import java.util.*;

/**
 * 作者：wangbingbing,
 * 创建日期：2020-12-08 10:27
 */
public class ListDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("wangbingbing");
        list.add("yangren");
        list.add("liangming");
        list.add("yangge");
        list.add("bingbing");
        list.add("bingge");
        for (Object str : list) {
            System.out.print(str+", ");
        }
        System.out.println();
        Map<String, Map<String,String>> map = new HashMap<>();
        Map<String,String> subMap = new HashMap<>();
        subMap.put("name","gujian");
        subMap.put("age","18");
        subMap.put("iphone","123456321456");
        map.put("user",subMap);

        Set<String> set = map.keySet();
        for (String str : set) {
            Map<String, String> sb = map.get(str);
            System.out.println(sb.get("name"));
            System.out.println(sb);
            Iterator<Map.Entry<String, String>> it = sb.entrySet().iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }


    }
}
