package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class PlayerC extends Player {

    public PlayerC(Player player) {
        setPlayer(player);
    }

    @Override
    public void handle(int position) {
        if (position == 3) {
            System.out.println("PlayerC 喝酒！");
        } else {
            System.out.println("PlayerC 把花向下传递");
            nextPlayer(position);
        }
    }
}