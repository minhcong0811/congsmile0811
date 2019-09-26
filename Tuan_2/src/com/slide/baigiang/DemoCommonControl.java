package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoCommonControl extends JFrame {
    public DemoCommonControl (String title) {
        super(title);
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        Font font = new Font("Arial",Font.BOLD | Font.ITALIC,15);

        //JPanel
        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));

        //JButton
        JButton btnWatch = new JButton(" Watch");
        btnWatch.setIcon(new ImageIcon("D:\\Images\\watch.ico"));
        btnWatch.setMnemonic('W');
        btnWatch.setFont(font);
        btnWatch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                JOptionPane.showMessageDialog(null, "tic tac tic tac");
            }
        });
        pnl.add(btnWatch);

        //JLabel
        JLabel lbl = new JLabel(" <- This is my watch");
        lbl.setForeground(Color.BLACK);
        lbl.setFont(font);
        ImageIcon icon = new ImageIcon("D:\\Images\\watch.ico");
        lbl.setIcon(icon);
        pnl.add(lbl);

        //JTextField
        JLabel lblTen = new JLabel("Nhap ten ban tai day :");
        lblTen.setFont(font);
        JTextField txtTen  = new JTextField(15);
        //txtTen.setEditable(false);
        txtTen.setText("Hello");
        pnl.add(lblTen);
        pnl.add(txtTen);

        //JTextArea
        JLabel lblDes = new JLabel("Mo ta:");
        JTextArea are = new JTextArea(5, 15);
        JScrollPane sc = new JScrollPane(are);
        pnl.add(lblDes);
        pnl.add(sc);

        //end
        JLabel lblEnd = new JLabel("Het roi");
        pnl.add(lblEnd);
        //add to Panel pnl
        add(pnl);
    }

    public static void main(String[] args) {
        new DemoCommonControl("Demo Common Control");
    }
}
