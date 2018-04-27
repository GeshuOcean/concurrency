package com.ocean.concurrency.example.singleton;

import com.ocean.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载时进行创建 如果构造函数过多处理加载资源多加载类时就会特别慢可能造成资源浪费
 */
@ThreadSafe
public class SingletonExample2 {

    // 私有构造函数
    private SingletonExample2() {

    }

    // 单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    // 静态的工厂方法
    public static SingletonExample2 getInstance() {
        return instance;
    }
}
