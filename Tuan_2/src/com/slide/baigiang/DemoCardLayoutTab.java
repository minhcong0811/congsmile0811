package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoCardLayoutTab extends JFrame {
    public DemoCardLayoutTab (String title) {
        super(title);
        setVisible(true);
        setSize(430, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane myTabled=new JTabbedPane();
        JPanel pnTab1=new JPanel();
        pnTab1.setBackground(Color.GREEN);
        pnTab1.add(new JLabel("Hello, this is Tab 1"));
        JPanel pnTab2=new JPanel();
        pnTab2.setBackground(Color.ORANGE);
        pnTab2.add(new JLabel("Hello, this is Tab 2"));
        myTabled.add(pnTab1,"Tab1");
        myTabled.add(pnTab2,"Tab2");
        add(myTabled);
    }

    public static void main(String[] args) {
        new DemoCardLayoutTab("Demo CardLayout Tabbed Pane");
    }
}
