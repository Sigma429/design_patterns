package com.sigma429.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version v1.0
 * @ClassName: RuntimeDemo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime2 == runtime);
    }
}
