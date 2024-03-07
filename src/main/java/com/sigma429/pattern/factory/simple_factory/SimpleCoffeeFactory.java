package com.sigma429.pattern.factory.simple_factory;

/**
 * ClassName:SimpleCoffeeFactory
 * Package:com.sigma429.pattern.factory.simple_factory
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 16:26
 * @Version:v1.0
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("americano".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;

    }
}
