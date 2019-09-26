package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoJFrame extends JFrame {
    public DemoJFrame(String title) {
        super(title);
        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.black);
    }

    public static void main(String[] args) {
        new DemoJFrame("First JFrame App");
    }
}
