package com.tufusi.kkkotlin.design_patterns.StructuralType.bridge;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description 抽象化角色
 */
abstract public class Abstraction {

    // 定义对实现化角色的引用
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    // 业务方法
    public void operation(){
        implementor.operationImp();
    }
}