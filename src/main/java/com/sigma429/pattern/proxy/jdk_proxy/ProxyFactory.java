package com.sigma429.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName:ProxyFactory
 * Package:com.sigma429.pattern.proxy.jdk_proxy
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/08 - 16:49
 * @Version:v1.0
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject() {
        // 返回代理对象
        /*
            ClassLoader loader : 类加载器，用于加载代理类。可以通过目标对象获取类加载器
            Class<?>[] interfaces ： 代理类实现的接口的字节码对象
            InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                        Object proxy : 代理对象。和proxyObject对象是同一个对象，在invoke方法中基本不用
                        Method method ： 对接口中的方法进行封装的method对象
                        Object[] args ： 调用方法的实际参数
                        返回值： 方法的返回值。
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理点收取一定的服务费用(jdk动态代理)");
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                });
        return proxyObject;
    }
}
