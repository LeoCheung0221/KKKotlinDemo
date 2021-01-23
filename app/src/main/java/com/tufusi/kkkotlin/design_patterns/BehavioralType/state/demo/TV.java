package com.tufusi.kkkotlin.design_patterns.BehavioralType.state.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 环境角色
 */
public class TV {

    public final static Channel CCTV1 = new CCTV1();
    public final static Channel CCTV2 = new CCTV2();
    public final static Channel CCTV3 = new CCTV3();

    // 当前频道
    private Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    // 播放CCTV1
    public void displayCCTV1(){
        setChannel(CCTV1);
        channel.display();
    }
    // 播放CCTV2
    public void displayCCTV2(){
        setChannel(CCTV2);
        channel.display();
    }
    // 播放CCTV3
    public void displayCCTV3(){
        setChannel(CCTV3);
        channel.display();
    }
}