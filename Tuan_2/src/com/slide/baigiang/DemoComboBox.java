package com.slide.baigiang;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class DemoComboBox extends JFrame {
    public DemoComboBox (String title) {
        super(title);
        setVisible(true);
        setSize(170, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Combo Box
        JComboBox cbo = new JComboBox();
        cbo.addItem("Xuat xac");
        cbo.addItem("Gioi");
        cbo.addItem("Kha");
        cbo.addItem("Trung binh");
        //Other way
        //String arr[]={"Xuat sac", "Gioi", "Kha", "Trung binh"};
        //JComboBox cbo = new JComboBox(arr);
        add(cbo);
    }

    public static void main(String[] args) {
        new DemoComboBox("Demo Combo Box");
    }
}
