package com.tufusi.kkkotlin.design_patterns.StructuralType.combine;

import java.util.ArrayList;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.operate();
        // 创建树枝节点
        Composite branch = new Composite();
        // 创建叶子节点
        Leaf leaf = new Leaf();
        // 组件树形结构
        root.add(branch);
        branch.add(leaf);

        display(root);
    }

    // 遍历树
    public static void display(Composite root) {
        ArrayList<Component> list = root.getComponentList();
        for (Component c : list) {
            if (c instanceof Leaf) { // 如果节点类型是叶子节点
                c.operate();
            } else { // 树枝节点
                c.operate();
                display((Composite) c); // 递归调用
            }
        }
    }
} 