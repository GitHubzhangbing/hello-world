package com.gitdemo.web.servlet;

import java.util.HashMap;

/**
 * @ClassName: Mytest
 * @Description: HashMap
 * @Author wj
 * @Date 2021/7/3
 * @Version 1.0
 */
public class Mytest {
    public static void main(String[] args) {
        System.out.println("-------my test------");
        HashMap<String,Object> map = new HashMap();
        System.out.println(map);                             // {}
        System.out.println(map.put("通话",10));               // null
        System.out.println(map.put("随便",20));               // null
        System.out.println(map.put("通话",30));               // 10
        System.out.println(map.put("重地",40));               // null
        System.out.println("集合中键值对数量：" + map.size());   // 集合中键值对数量：3
        System.out.println("集合内容" + map);                  // 集合内容{通话=30, 随便=20, 重地=40}
    }
}
