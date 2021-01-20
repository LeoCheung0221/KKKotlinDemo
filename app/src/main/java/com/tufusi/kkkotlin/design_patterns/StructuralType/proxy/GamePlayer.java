package com.tufusi.kkkotlin.design_patterns.StructuralType.proxy;

/**
 * Created by LeoCheung on 2021/1/20.
 *
 * @description
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "成功升了1级！");
    }
}