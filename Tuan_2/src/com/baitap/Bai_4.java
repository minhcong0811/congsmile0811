package com.baitap;

import javax.swing.*;
import java.awt.*;

public class Bai_4 extends JFrame {
    public Bai_4 (String title) {
        super(title);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
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
        new Bai_4("Bai 4 - Thuc hanh ve BorderLayout");
    }
}
