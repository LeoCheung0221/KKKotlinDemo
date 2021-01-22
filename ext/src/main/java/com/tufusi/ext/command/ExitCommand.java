package com.tufusi.ext.command;

import javax.swing.JButton;

/**
 * Created by LeoCheung on 2021/1/22.
 *
 * @description
 */
public class ExitCommand extends JButton implements MyCommand {

    public ExitCommand(String text) {
        super(text);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}