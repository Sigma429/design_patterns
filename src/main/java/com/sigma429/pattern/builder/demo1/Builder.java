package com.sigma429.pattern.builder.demo1;

/**
 * ClassName:Builder
 * Package:com.sigma429.pattern.builder.demo1
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/07 - 20:09
 * @Version:v1.0
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    // 构建自行车的方法
    public abstract Bike createBike();

}
