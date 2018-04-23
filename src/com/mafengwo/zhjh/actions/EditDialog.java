package com.mafengwo.zhjh.actions;

import com.mafengwo.zhjh.tools.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditDialog extends JFrame implements ActionListener {

    private JTextField jTextField;
    private JButton jButton;
    private JLabel textArea;
    public EditDialog() throws HeadlessException {
        jTextField = new JTextField();
        jButton = new JButton("找找看");
        jButton.addActionListener(this);
        textArea = new JLabel();
        textArea.setText("<html>就哦啊放假哦啊大家佛教生动风景哦撒娇佛激动啊福建傲圣诞节佛阿萨我放假哦我金</br>佛IE为奇偶if进我房间哦啊上飞机哦if激动赛季佛描述符飞机哦我阿斯蒂芬加速度计佛德积分</html>");
        add(textArea);
        add(jTextField);
        add(jButton);

        this.setLayout(new GridLayout(3,1));            //选择GridLayout布局管理器
        this.setTitle("学生成绩管理系统");
        this.setSize(500,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //设置当关闭窗口时，保证JVM也退出
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Log.i("事件名字是啥啊："+e.getActionCommand()+"，哈哈哈："+jTextField.getText());
    }
}
