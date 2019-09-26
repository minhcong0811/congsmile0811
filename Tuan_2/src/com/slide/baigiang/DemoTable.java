package com.slide.baigiang;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DemoTable extends JFrame {
    public DemoTable (String title) {
        super(title);
        setVisible(true);
        setSize(700, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        //Table
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Mã");
        dtm.addColumn("Tên");
        dtm.addColumn("Tuổi");
        final JTable tbl = new JTable(dtm);
        dtm.addRow(new String[]{"1009","Nguyen Son Hai","24"});
        dtm.addRow(new String[]{"0403","Nguyen Thi Hoang Oanh","21"});
        dtm.addRow(new String[]{"2904","Nguyen Ngoc Kha","20"});
        JScrollPane sc=new JScrollPane(tbl);
        getContentPane();
        setLayout(new BorderLayout());
        add(sc,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new DemoTable("Demo Table");
    }
}
