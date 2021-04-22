package ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.*;

public class ButtonAndFile extends JFrame {

    JButton Display;
    JTextField Text;

    ButtonAndFile() {
        setTitle("Text display:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500, 700);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 20;

        Text = new JTextField("");
        Text.setBounds(70, 50, width, height);

        Display = new JButton("OK");
        Display.setBounds(70, 150, width, height);
        Display.addActionListener(new DisplayListener());

        add(Text);
        add(Display);

    }

    public static void main(String[] args) {
        new  ButtonAndFile();
    }


    class DisplayListener implements ActionListener{
        public void actionPerformed (ActionEvent event) {
            if(event.getSource()==Display){

        }
        }
    }
}
