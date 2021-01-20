package com.tufusi.kkkotlin.design_patterns.StructuralType.proxy;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class ClientDemo {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("路飞");
        GamePlayerProxy proxy = new GamePlayerProxy(player);
        proxy.killBoss();
        proxy.upGrade();
    }
} 