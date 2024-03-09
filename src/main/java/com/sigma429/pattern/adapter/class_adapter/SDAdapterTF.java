package com.sigma429.pattern.adapter.class_adapter;

/**
 * ClassName:SDAdapterTF
 * Package:com.sigma429.pattern.adapter.class_adapter
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/03/09 - 15:23
 * @Version:v1.0
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    public String readSD() {
        System.out.println("adapter read tf card");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
