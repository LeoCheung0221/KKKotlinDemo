package com.tufusi.kkkotlin.design_patterns.StructuralType.proxy.dynamic;

import com.tufusi.kkkotlin.design_patterns.StructuralType.proxy.GamePlayer;
import com.tufusi.kkkotlin.design_patterns.StructuralType.proxy.IGamePlayer;

/**
 * @author LeoCheung <a href="mailto:leocheung4ever@gmail.com">Contact me.</a>
 * @version 1.0
 * @description DESCRIPTION
 * @since 2021/3/1 12:28
 */
public class Test {
    public static void main(String[] args) {
        // 目标对象
        IGamePlayer target = new GamePlayer("XXX");
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        IGamePlayer proxy = (IGamePlayer) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
        proxy.killBoss();
        proxy.upGrade();
    }
} 