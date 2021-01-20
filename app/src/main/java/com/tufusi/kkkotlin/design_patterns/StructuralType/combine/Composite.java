package com.tufusi.kkkotlin.design_patterns.StructuralType.combine;

import java.util.ArrayList;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description 树枝组件角色
 * 该角色代表参加组合的、其下有分支的树枝对象，它的作用是将树枝和叶子组合成一个树形结构，并定义出管理子对象的方法，如add()、remove()等
 */
public class Composite implements Component {

    // 组件容器
    private ArrayList<Component> componentList = new ArrayList<>();

    // 添加组件
    public void add(Component component) {
        componentList.add(component);
    }

    // 删除组件
    public void remove(Component component) {
        componentList.remove(component);
    }

    // 获取子组件
    public ArrayList<Component> getComponentList() {
        return componentList;
    }

    @Override
    public void operate() {
        // 业务逻辑代码
        System.out.println("树枝节点 - 业务操作");
    }
}