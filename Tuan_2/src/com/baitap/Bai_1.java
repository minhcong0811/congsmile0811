package com.baitap;

import javax.swing.*;

public class Bai_1 extends JFrame {
    public Bai_1 (String title) {
        super(title);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bai_1("Bai 1 - Hien thi cua so window");
    }
}
