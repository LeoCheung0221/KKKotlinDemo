package com.tufusi.kkkotlin.design_patterns.StructuralType.proxy;

import java.util.Date;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player;

    /**
     * 持有公共接口的引用，这也是代理类关联之处，但也是代理类的局限
     * 可以通过JDK内置的代理类进行类反射实现
     * 也可以通过cglib实现任意类的代理实现
     *
     * @param player 代理接口引用
     */
    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void killBoss() {
        this.log();
        player.killBoss();
    }

    // 记录打怪的时间
    private void log() {
        System.out.println("打怪时间" + new Date().toString());
    }

    @Override
    public void upGrade() {
        player.upGrade();
        this.duration();
    }

    // 记录打怪所用的耗时
    private void duration() {
        System.out.println("升1级耗费50min");
    }
}