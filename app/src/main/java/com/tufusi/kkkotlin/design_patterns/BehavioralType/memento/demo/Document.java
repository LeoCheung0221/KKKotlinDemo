package com.tufusi.kkkotlin.design_patterns.BehavioralType.memento.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description 需要被纳入版本控制系统的文档类
 */
public class Document {

    String content; //需要备份的状态
    String otherContent; // 不需要备份的状态

    // 保存一个备份
    public Backup save(){
        System.out.println("保存备份");
        return new Backup(content);
    }

    //恢复为某个状态
    public void resume(Backup backup){
        System.out.println("恢复备份");
        content = backup.content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", otherContent='" + otherContent + '\'' +
                '}';
    }
}