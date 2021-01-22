package com.tufusi.ext.command;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class MyFrame extends JFrame implements ActionListener {

    private JPanel p;
    private YellowCommand btnYellow;
    private RedCommand btnRed;
    private ExitCommand btnExit;

    public MyFrame() {
        super("命令模式");
        p = new JPanel();
        this.add(p);

        // 实例化具体命令
        btnYellow = new YellowCommand("黄色", p);
        btnRed = new RedCommand("红色", p);
        btnExit = new ExitCommand("退出");

        // 将按钮控件添加到面板
        p.add(btnYellow);
        p.add(btnRed);
        p.add(btnExit);
        // 添加监听对象
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
        btnExit.addActionListener(this);
        // 设置窗体
        this.setSize(400,300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand command = (MyCommand) e.getSource();
        command.execute();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}