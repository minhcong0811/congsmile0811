package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoEventListener extends JFrame {
    public DemoEventListener (String title) {
        super(title);
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // In ra thong bao
        JPanel pnl = new JPanel(new FlowLayout());
        String nhapTen = JOptionPane.showInputDialog("Nhập :");
        JButton btn1 = new JButton("Say Hello!");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "Hello, ten cua ban la " + nhapTen );
            }
        });
        pnl.add(btn1);
        add(pnl);
    }
    public static void main(String[] args) {
        new  DemoEventListener("Demo Combo Box");
    }
}
