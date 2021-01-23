package com.tufusi.kkkotlin.design_patterns.BehavioralType.memento.demo;

/**
 * Created by LeoCheung on 2021/1/23.
 *
 * @description
 */
public class Test {
    public static void main(String[] args) {
        VersionControlSystem vcs = new VersionControlSystem();

        Document document = new Document();
        document.content = "content1";
        document.otherContent = "otherContent1";
        System.out.println(document);
        vcs.add(document.save()); //保存备份

        document.content = "content2";
        document.otherContent = "otherContent2";
        System.out.println(document);
        vcs.add(document.save()); //保存备份

        document.content = "content3";
        document.otherContent = "otherContent3";
        System.out.println(document);
        document.resume(vcs.get(1)); //恢复版本1

        System.out.println(document);

        document.resume(vcs.getLastVersion()); //恢复最新版本
        System.out.println(document);
    }
} 