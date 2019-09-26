package com.baitap;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai_5 extends JFrame {
    public Bai_5 (String title) {
        super(title);
        setSize(550, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.white);
        Font font=new Font("Arial",Font.BOLD | Font.ITALIC,25);

        // tao panel app
        JPanel app = new JPanel();
        app.setLayout(new BoxLayout(app, BoxLayout.Y_AXIS));
        Border borM = BorderFactory.createLineBorder(Color.GRAY);
        TitledBorder borApp = new TitledBorder(borM);
        app.setBorder(borApp);

        //them tieu de
        JLabel titleLabel = new JLabel("Giai phuong trinh bac 2");
        titleLabel.setFont(font);
        app.add(titleLabel);

        //group1
        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
        Border bor = BorderFactory.createLineBorder(Color.RED);
        TitledBorder titleBorder = new TitledBorder(bor, "Nhap a, b, c:");
        pnGroup.setBorder(titleBorder);
        //label
        JLabel lblNhapA = new JLabel("Nhap a:");
        JLabel lblNhapB = new JLabel("Nhap b:");
        JLabel lblNhapC = new JLabel("Nhap c:");
        JLabel lblKetQua = new JLabel("Ket qua:");
        //text box
        JTextField txtSoA = new JTextField();
        JTextField txtSoB = new JTextField();
        JTextField txtSoC = new JTextField();
        JTextField txtKetQua = new JTextField();
        //
        txtKetQua.setEnabled(false);
        txtKetQua.setBackground(Color.DARK_GRAY);
        txtKetQua.setForeground(Color.white);
        //
        pnGroup.add(lblNhapA);
        pnGroup.add(txtSoA);
        pnGroup.add(lblNhapB);
        pnGroup.add(txtSoB);
        pnGroup.add(lblNhapC);
        pnGroup.add(txtSoC);
        pnGroup.add(lblKetQua);
        pnGroup.add(txtKetQua);
        //
        app.add(pnGroup);

        //group2
        JPanel pnGroup2 = new JPanel();
        pnGroup2.setLayout(new FlowLayout());
        Border bor2 = BorderFactory.createLineBorder(Color.BLACK);
        TitledBorder titleBorder2 = new TitledBorder(bor2, "Chon thao tac:");
        pnGroup2.setBorder(titleBorder2);
        //
        JButton btnGiai = new JButton("Giai");
        JButton btnXoaTrang = new JButton("Xoa Trang");
        JButton btnThoat = new JButton("Thoat");
        pnGroup2.add(btnGiai);
        pnGroup2.add(btnXoaTrang);
        pnGroup2.add(btnThoat);
        app.add(pnGroup2);

        //bat su kien buttuon Giai
        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double a = Double.parseDouble(txtSoA.getText());
                double b = Double.parseDouble(txtSoB.getText());
                double c = Double.parseDouble(txtSoC.getText());
                double delta = Math.pow(b, 2) - ( 4 * a * c );
                double x1, x2;
                if (a == 0) {
                    if(b == 0) {
                        if(c == 0)
                            txtKetQua.setText("Phuong trinh co vo so nghiem");
                        else
                            txtKetQua.setText("Phuong trinh vo nghiem");
                    }
                    else
                        txtKetQua.setText("Phuong trinh co nghiem x = " + (-c / b));
                }
                else if (delta < 0)
                    txtKetQua.setText("Phuong trinh vo nghiem");
                else if (delta == 0)
                    txtKetQua.setText("Phuong trinh co nghiem kep x1 = x2 = " + (- b / 2 * a));
                else {
                    x1 = (- b + Math.sqrt(delta) / (2 * a));
                    x2 = (- b - Math.sqrt(delta) / (2 * a));
                    txtKetQua.setText("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
                }
            }
        });

        //bat su kien button xoa trang
        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtSoA.setText("");
                txtSoB.setText("");
                txtSoC.setText("");
                txtKetQua.setText("");
            }
        });

        //bat su kiem button thoat
        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        //
        add(app);
    }

    public static void main(String[] args) {
        new Bai_5("Bai 5 - Thuc hanh ve cac control can ban");
    }
}
