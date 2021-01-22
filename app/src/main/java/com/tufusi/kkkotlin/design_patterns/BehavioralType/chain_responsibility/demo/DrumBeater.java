package com.tufusi.kkkotlin.design_patterns.BehavioralType.chain_responsibility.demo;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class DrumBeater {
    public static void main(String[] args) {
        // 创建一个链
        Player player = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));
        // 击鼓3下停止
        player.handle(30);
    }
} 