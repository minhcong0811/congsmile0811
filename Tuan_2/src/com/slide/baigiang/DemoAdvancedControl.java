package com.slide.baigiang;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class DemoAdvancedControl extends JFrame {
    public DemoAdvancedControl (String title) {
        super(title);
        setVisible(true);
        setSize(170, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
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
        pnl.add(menubar, BorderLayout.NORTH);

        JToolBar toolBar=new JToolBar("MyBar");
        JButton btn1=new JButton("New");
        JCheckBox chk1=new JCheckBox("Checkme");
        toolBar.add(btn1); toolBar.add(chk1);
        JButton btn2=new JButton("Exit");
        toolBar.add(btn2);
        pnl.add(toolBar, BorderLayout.NORTH);

        //Tree
        DefaultMutableTreeNode mtn = new DefaultMutableTreeNode("DH Gia Dinh");
        final JTree tree = new JTree(mtn);
        DefaultMutableTreeNode cnttNode = new DefaultMutableTreeNode("Cong Nghe Thong Tin");
        mtn.add(cnttNode);
        DefaultMutableTreeNode dhpmNode = new DefaultMutableTreeNode("Lop 11DHPM");
        cnttNode.add(dhpmNode);
        DefaultMutableTreeNode dhmtNode = new DefaultMutableTreeNode("Lop 11DHMT");
        cnttNode.add(dhmtNode);
        DefaultMutableTreeNode nnaNode = new DefaultMutableTreeNode("Ngon Ngu Anh");
        mtn.add(nnaNode);
        DefaultMutableTreeNode dhnaNode = new DefaultMutableTreeNode("Lop 11DHNA");
        nnaNode.add(dhnaNode);
        pnl.add(tree, BorderLayout.NORTH);

        add(pnl);
    }

    public static void main(String[] args) {
        new DemoAdvancedControl("Demo Advanced Control");
    }
}
