package com.slide.baigiang;

import java.awt.*;

public class DemoAWT extends Frame {
    public DemoAWT(String title) {
        super(title);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoAWT("First App");
    }
}
