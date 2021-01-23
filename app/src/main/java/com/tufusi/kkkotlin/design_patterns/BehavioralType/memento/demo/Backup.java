package com.tufusi.kkkotlin.design_patterns.BehavioralType.memento.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 版本控制系统中保存的每一个备份
 */
public class Backup {

    String content;
    int version;

    public Backup(String content) {

        this.content = content;
    }
}