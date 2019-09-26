package com.slide.baigiang;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class DemoTree extends JFrame {
    public DemoTree(String title) {
        super(title);
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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
        add(tree);
    }

    public static void main(String[] args) {
        new DemoTree("Demo Tree");
    }
}
