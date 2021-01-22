package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class PlayerD extends Player {

    public PlayerD(Player player) {
        setPlayer(player);
    }

    @Override
    public void handle(int position) {
        if (position == 4) {
            System.out.println("PlayerD 喝酒！");
        } else {
            System.out.println("PlayerD 把花向下传递");
            nextPlayer(position);
        }
    }
}