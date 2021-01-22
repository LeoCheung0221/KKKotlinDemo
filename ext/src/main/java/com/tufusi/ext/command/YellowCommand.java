package com.tufusi.ext.command;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description 具体命令颜色，让面板变为黄色的命令
 */
public class YellowCommand extends JButton implements MyCommand {

    private JPanel p;

    public YellowCommand(String name, JPanel p) {
        // 构造一个按钮控件
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        // 改变面板的背景颜色
        p.setBackground(Color.YELLOW);
    }
}