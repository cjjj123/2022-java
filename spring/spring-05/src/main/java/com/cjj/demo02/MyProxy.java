package com.cjj.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * xiangjiaoyun
 * author:chenjianjie
 * Date:2022/5/31
 * Time:15:04
 */
public class MyProxy implements InvocationHandler {

    private Object object;

    public MyProxy(Object object) {
        this.object = object;
    }

    // 生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(),this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(object, args);
        return invoke;
    }
}
