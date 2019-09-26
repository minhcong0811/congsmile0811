package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoScrollPane extends JFrame {
    public DemoScrollPane (String title) {
        super(title);
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Scroll Pane
        ImageIcon img=new ImageIcon("D:\\images\\avicii.png");
        JLabel lblImg=new JLabel(img);
        JScrollPane scimg = new JScrollPane(lblImg,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scimg.setPreferredSize(new Dimension(600, 600));
        add(scimg);
    }

    public static void main(String[] args) {
        new DemoScrollPane ("Demo Scroll Pane");
    }
}
