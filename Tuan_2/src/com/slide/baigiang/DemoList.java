package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoList extends JFrame {
    public DemoList (String title) {
        super(title);
        setVisible(true);
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //List
        String Person[] = {"Nguyen Son Hai",
                "Nguyen Thi Hoang Oanh",
                "Nguyen Ngoc Kha",
                "Nguyen Van Huy",
                "Nguyen Van A",
                "Nguyen Van B"};
        JList jl = new JList(Person);

        //Chon mau nen
        jl.setSelectionBackground(Color.RED);
        //Chon mau chu
        jl.setSelectionForeground(Color.WHITE);
        //Chon duoc nhieu muc
        jl.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //Tao Scroll
        JScrollPane scjl = new JScrollPane(jl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        add(scjl);
    }

    public static void main(String[] args) {new DemoList("Demo List");
    }
}
