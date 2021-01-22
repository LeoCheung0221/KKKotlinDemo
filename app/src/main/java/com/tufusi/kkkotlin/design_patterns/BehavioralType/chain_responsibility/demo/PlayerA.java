package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class PlayerA extends Player {

    public PlayerA(Player player) {
        setPlayer(player);
    }

    @Override
    public void handle(int position) {
        if (position == 1) {
            System.out.println("PlayerA 喝酒！");
        } else {
            System.out.println("PlayerA 把花向下传递");
            nextPlayer(position);
        }
    }
}