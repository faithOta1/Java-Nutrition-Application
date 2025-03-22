package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage {
    public static void setUp(){
        JFrame frame = new JFrame("PawPlates");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //exit program when closing app

        JPanel p = new JPanel();

        frame.add(p);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        setUp();
    }
}
