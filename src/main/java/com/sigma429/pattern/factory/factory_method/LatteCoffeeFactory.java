package com.sigma429.pattern.factory.factory_method;

/**
 * ClassName:LatteCoffeeFactory
 * Package:com.sigma429.pattern.factory.factory_method
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 16:44
 * @Version:v1.0
 */
public class LatteCoffeeFactory implements  CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
