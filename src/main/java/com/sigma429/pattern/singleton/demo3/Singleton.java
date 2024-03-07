package com.sigma429.pattern.singleton.demo3;

/**
 * ClassName:Singleton
 * Package:com.sigma429.pattern.singleton.demo3
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 14:04
 * @Version:v1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
