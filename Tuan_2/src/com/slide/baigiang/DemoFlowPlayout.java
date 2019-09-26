package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoFlowPlayout  extends JFrame {
    public DemoFlowPlayout (String title) {
        super(title);
        setVisible(true);
        setSize(700, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        new DemoFlowPlayout("Demo FlowLayout");
    }
}
