package com.slide.baigiang;

import javax.swing.*;
import java.awt.*;

public class DemoMenuBar extends JFrame {
    public DemoMenuBar (String title) {
        super(title);
        setVisible(true);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Menu Bar
        JMenuBar menubar=new JMenuBar();
        setJMenuBar(menubar);
        JMenu mnuFile = new JMenu("File");
        JMenu mnuEdit = new JMenu("Edit");
        menubar.add(mnuFile);
        menubar.add(mnuEdit);
        JMenuItem mnuFileNew = new JMenuItem("New");
        JMenuItem mnuFileOpen = new JMenuItem("Open");
        JMenuItem mnuFileExit = new JMenuItem("Exit");
        mnuFile.add(mnuFileNew);
        mnuFile.add(mnuFileOpen);
        mnuFile.addSeparator();
        mnuFile.add(mnuFileExit);
        add(menubar);
    }

    public static void main(String[] args) {
        new DemoMenuBar ("Demo Menu Bar");
    }
}
