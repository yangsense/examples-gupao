package com.design.designpatterns.factory.basis;

/**
 * @ClassName BasisDemo
 * @Description 引出工厂设计模式
 * @Author Yeung sum
 * @Version 1.0
 **/

// 实现一个类实现接口,并供client调用
public class BasisClient {


    public static void main(String[] args) {

        IBasic basis = new BasisImpl();

        basis.test("别紧张,我只是个测试!!!");

    }

}
