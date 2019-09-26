package com.baitap;

import javax.swing.*;
import java.awt.*;

public class Bai_2 extends JFrame {
    public Bai_2 (String title) {
        super(title);
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);

        // JPanel style Flow
        JPanel pnFlow = new JPanel();
        pnFlow.setLayout(new FlowLayout());
        //or JPanel pnFlow = new JPanel(new FlowLayout());

        //JButton
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add cac control");
        JButton btn3 = new JButton("Tren 1 dong");
        JButton btn4 = new JButton("Neu het cho chua");
        JButton btn5 = new JButton("Thi xuong dong");

        //them cac button vao panel
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con = getContentPane();
        con.add(pnFlow);
    }

    public static void main(String[] args) {
        new Bai_2("Bai 2 - Thuc hanh ve FlowLayout");
    }
}
