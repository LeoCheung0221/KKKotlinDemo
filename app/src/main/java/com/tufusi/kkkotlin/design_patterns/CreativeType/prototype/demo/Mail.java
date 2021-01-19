package com.tufusi.kkkotlin.design_patterns.CreativeType.prototype.demo;

import org.jetbrains.annotations.NotNull;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class Mail implements Cloneable {
    // 收件人
    private String receiver;
    // 邮件标题
    private String subject;
    // 称谓
    private String appellation;
    // 邮件内容
    private String content;
    // 邮件的尾部，一般都是加上“xxx版权所有”等信息
    private String tail;

    // 构造函数
    public Mail(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    // clone方法
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}