package com.sigma429.pattern.singleton.demo1;

/**
 * ClassName:Client
 * Package:com.sigma429.pattern.singleton.demo1
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 13:54
 * @Version:v1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}
