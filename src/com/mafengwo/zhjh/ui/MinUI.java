package com.mafengwo.zhjh.ui;

import com.intellij.uiDesigner.core.GridLayoutManager;
import com.mafengwo.zhjh.tools.Log;
import org.jdesktop.swingx.VerticalLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinUI {
    public static void main(String[] args){
showUI();
    }

    private static void showUI() {
        new UI();
    }

    static class UI extends JFrame implements ActionListener {
        private JTextField jTextField;
        private JButton jButton;
        public UI() throws HeadlessException {
            setTitle("你们是谁啊");
            jTextField = new JTextField();
            jTextField.setSize(500,100);
            jButton = new JButton("确定");
            jButton.addActionListener(this);
            this.add(jTextField);
            this.add(jButton);

            setVisible(true);
            setSize(400,120);
            setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new GridLayout(2,1));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Log.i("点击动作："+e.getActionCommand()+","+jTextField.getText());
        }
    }
}
