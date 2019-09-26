package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoCardLayout extends JFrame {
    public  DemoCardLayout(String title) {
        super(title);
        setVisible(true);
        setSize(430, 430);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //JPanel BoxLayout
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
        //
        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        final JPanel pnCard1 = new JPanel();
        pnCard1.setBackground(Color.PINK);
        final JPanel pnCard2 = new JPanel();
        pnCard2.setBackground(Color.YELLOW);
        pnCenter.add(pnCard1, "mycard1");
        pnCenter.add(pnCard2, "mycard2");
        //Panel card
        JLabel lbl1 = new JLabel("Hello, this is card 1");
        JLabel lbl2 = new JLabel("Hello, this is card 2");
        pnCard1.add(lbl1);
        pnCard2.add(lbl2);
        //JButton
        JButton btnShowCard1 = new JButton("Show card 1");
        JButton btnShowCard2 = new JButton("Show card 2");
        //Action Listener
        btnShowCard1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CardLayout cl = (CardLayout)pnCenter.getLayout();
                cl.show(pnCenter, "mycard1");
            }
        });
        btnShowCard2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CardLayout cl = (CardLayout)pnCenter.getLayout();
                cl.show(pnCenter, "mycard2");
            }
        });
        //add
        pnBox.add(btnShowCard1);
        pnBox.add(btnShowCard2);
        pnBox.add(pnCenter);
        add(pnBox);
    }

    public static void main(String[] args) {
        new DemoCardLayout("Demo CardLayout");
    }
}
