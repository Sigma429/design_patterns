package com.sigma429.pattern.singleton.demo5;

/**
 * ClassName:Singleton
 * Package:com.sigma429.pattern.singleton.demo5
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 14:28
 * @Version:v1.0
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
