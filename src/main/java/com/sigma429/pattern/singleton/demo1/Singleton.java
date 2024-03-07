package com.sigma429.pattern.singleton.demo1;

/**
 * ClassName:Singleton
 * Package:com.sigma429.pattern.singleton.demo1
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 13:55
 * @Version:v1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
