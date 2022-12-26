package com.example.demo;

import java.awt.*;
import java.awt.event.*;

class FrameDemo extends Frame implements WindowListener {
    public static void main(String[] args) {
        new FrameDemo();
    }

    public FrameDemo() {
        setLayout(null);
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 80, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to AWT.");
            }
        });
        add(b);
        add(tf);
        addWindowListener(this);
        setTitle("FrameDemo");
        setSize(300, 300);
        setVisible(true);
    }

    // override the 7 abstract methods of WindowListener
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }
}
