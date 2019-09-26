package com.slide.baigiang;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;


public class DemoButtonGroup extends JFrame {
    public DemoButtonGroup (String title) {
        super(title);
        setVisible(true);
        setSize(170, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel Button Group
        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
        Border bor=BorderFactory.createLineBorder(Color.RED);
        TitledBorder titleBorder = new TitledBorder(bor, "Chon ne");
        pnGroup.setBorder(titleBorder);
        JRadioButton rad1 = new JRadioButton("Rat hai long");
        JRadioButton rad2 = new JRadioButton("Hai long");
        JRadioButton rad3 = new JRadioButton("Tam chap nhan");
        JRadioButton rad4 = new JRadioButton("Khong chap nhan");
        ButtonGroup group=new ButtonGroup();
        group.add(rad1);
        group.add(rad2);
        group.add(rad3);
        group.add(rad4);
        pnGroup.add(rad1);
        pnGroup.add(rad2);
        pnGroup.add(rad3);
        pnGroup.add(rad4);
        add(pnGroup);
    }

    public static void main(String[] args) {
        new DemoButtonGroup("Demo Button Group");
    }
}
