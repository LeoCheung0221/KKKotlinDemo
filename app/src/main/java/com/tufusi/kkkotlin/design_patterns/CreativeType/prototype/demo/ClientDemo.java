package com.tufusi.kkkotlin.design_patterns.CreativeType.prototype.demo;

import java.util.Random;

/**
 * Created by LeoCheung on 2021/1/19.
 *
 * @description
 */
public class ClientDemo {

    // 发送邮件的数量，这个值是从数据库中获得的
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 定义一个邮件对象
        Mail mail = new Mail("某商场五一抽奖活动",
                "五一抽奖活动通知：凡在五一期间在本商场购物满200元的客户均可获得抽奖机会！");

        mail.setTail("解释权归本商场所有");
        while (i < MAX_COUNT) {
            // 克隆邮件
            Mail cloneMail = mail.clone();
            // 以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandomString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandomString(5) + "@" + getRandomString(8) + ".com");

            // 发送邮件
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
    }

    // 获得指定长度的随机字符串
    public static String getRandomString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }

        return sb.toString();
    }
} 