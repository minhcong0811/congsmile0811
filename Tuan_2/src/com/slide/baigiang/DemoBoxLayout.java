package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoBoxLayout extends JFrame {
    public DemoBoxLayout (String title) {
        super(title);
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        Font font=new Font("Arial",Font.BOLD | Font.ITALIC,25);
        // X JPanel
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        // pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
        //Button 1
        JButton btn1=new JButton("BoxLayout");
        btn1.setForeground(Color.RED);
        btn1.setFont(font);
        pnBox.add(btn1);
        //Button 2
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.GREEN);
        btn2.setFont(font);
        pnBox.add(btn2);
        //Button 3
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.BLUE);
        btn3.setFont(font);
        // add
        pnBox.add(btn3);
        add(pnBox);
    }

    public static void main(String[] args) {
        new DemoBoxLayout("Demo BoxLayout");
    }
}
