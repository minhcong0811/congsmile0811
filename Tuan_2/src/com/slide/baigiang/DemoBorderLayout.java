package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoBorderLayout extends JFrame {
    public DemoBorderLayout (String title) {
        super(title);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.RED);
        pnBorder.add(pnNorth,BorderLayout.NORTH);
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.BLUE);
        pnBorder.add(pnSouth,BorderLayout.SOUTH);
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.GREEN);
        pnBorder.add(pnWest,BorderLayout.WEST);
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.PINK);
        pnBorder.add(pnEast,BorderLayout.EAST);
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.WHITE);
        pnBorder.add(pnCenter,BorderLayout.CENTER);
        add(pnBorder);

    }

    public static void main(String[] args) {
       new DemoBorderLayout("Demo Border Layout");
    }
}
