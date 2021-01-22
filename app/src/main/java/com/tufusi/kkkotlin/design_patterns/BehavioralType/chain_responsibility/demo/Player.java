package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
abstract public class Player {
    private Player player;

    public abstract void handle(int position);

    public void setPlayer(Player player) {
        this.player = player;
    }

    // 传递给下一个
    public void nextPlayer(int position) {
        if (player != null) {
            player.handle(position);
        } else {
            System.out.println("游戏结束");
        }
    }
}