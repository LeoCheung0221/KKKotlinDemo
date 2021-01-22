package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class PlayerB extends Player {

    public PlayerB(Player player) {
        setPlayer(player);
    }

    @Override
    public void handle(int position) {
        if (position == 2) {
            System.out.println("PlayerB 喝酒！");
        } else {
            System.out.println("PlayerB 把花向下传递");
            nextPlayer(position);
        }
    }
}