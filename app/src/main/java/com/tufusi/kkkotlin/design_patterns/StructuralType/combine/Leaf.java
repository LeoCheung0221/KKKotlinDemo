package com.tufusi.kkkotlin.design_patterns.StructuralType.combine;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Leaf implements Component {
    @Override
    public void operate() {
        // 业务逻辑代码
        System.out.println("叶子节点 - 业务操作");
    }
}