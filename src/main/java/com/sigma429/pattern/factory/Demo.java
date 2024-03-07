package com.sigma429.pattern.factory;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:Demo
 * Package:com.sigma429.pattern.factory
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 18:22
 * @Version:v1.0
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("令狐冲");
        list.add("风清扬");
        list.add("任我行");
        // 获取迭代器对象
        Iterator<String> it = list.iterator();
        // 使用迭代器遍历
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }
    }
}
