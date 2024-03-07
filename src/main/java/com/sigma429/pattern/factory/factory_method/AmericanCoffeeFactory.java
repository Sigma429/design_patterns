package com.sigma429.pattern.factory.factory_method;

/**
 * ClassName:AmericanCoffeeFactory
 * Package:com.sigma429.pattern.factory.factory_method
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 16:44
 * @Version:v1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
