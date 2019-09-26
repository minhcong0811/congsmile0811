package com.slide.baigiang;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class DemoCheckBox extends JFrame {
    public DemoCheckBox (String title) {
        super(title);
        setVisible(true);
        setSize(170, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //
        JPanel pnCheck=new JPanel();
        pnCheck.setLayout(new GridLayout(2, 2));
        Border bor = BorderFactory .createEtchedBorder(Color.GREEN, Color.ORANGE);
        TitledBorder titleBorder = new TitledBorder(bor, "Mon hoc yeu thich:");
        pnCheck.setBorder(titleBorder);
        JCheckBox chk1=new JCheckBox("Java");
        JCheckBox chk2=new JCheckBox("Python");
        JCheckBox chk3=new JCheckBox("C Sharp");
        JCheckBox chk4=new JCheckBox("Ruby");
        pnCheck.add(chk1);
        pnCheck.add(chk2);
        pnCheck.add(chk3);
        pnCheck.add(chk4);
        add(pnCheck);
    }

    public static void main(String[] args) {
        new DemoCheckBox("Demo Check Box");
    }
}
