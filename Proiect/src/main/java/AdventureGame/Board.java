package AdventureGame;

import javax.swing.*;
import java.awt.*;


public class Board {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLable, weaponNameLable;
    JButton startButton, c1, c2, c3, c4;
    JTextArea mainTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);


    public void createBoard(Game.ChoiceHandler cHandler){
        //WINDOW
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);


        //TITLE SCREEN
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 500);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //GAME SCREEN
        mainTextPanel=new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea=new JTextArea("This is the main text area");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel=new JPanel();
        choiceButtonPanel.setBounds(250,325,300,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        c1=new JButton("Choice 1");
        c1.setBackground(Color.black);
        c1.setForeground(Color.white);
        c1.setFont(normalFont);
        c1.setFocusPainted(false);
        c1.addActionListener(cHandler);
        c1.setActionCommand("c1");
        choiceButtonPanel.add(c1);

        c2=new JButton("Choice 2");
        c2.setBackground(Color.black);
        c2.setForeground(Color.white);
        c2.setFont(normalFont);
        c2.setFocusPainted(false);
        c2.addActionListener(cHandler);
        c2.setActionCommand("c2");
        choiceButtonPanel.add(c2);

        c3=new JButton("Choice 3");
        c3.setBackground(Color.black);
        c3.setForeground(Color.white);
        c3.setFont(normalFont);
        c3.setFocusPainted(false);
        c3.addActionListener(cHandler);
        c3.setActionCommand("c3");
        choiceButtonPanel.add(c3);

        c4=new JButton("Choice 4");
        c4.setBackground(Color.black);
        c4.setForeground(Color.white);
        c4.setFont(normalFont);
        c4.setFocusPainted(false);
        c4.addActionListener(cHandler);
        c4.setActionCommand("c4");
        choiceButtonPanel.add(c4);

        playerPanel=new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        window.add(playerPanel);

        hpLabel=new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpNumberLabel=new JLabel();
        hpNumberLabel.setForeground(Color.white);
        hpNumberLabel.setFont(normalFont);
        playerPanel.add(hpNumberLabel);

        weaponLable=new JLabel("Weapon:");
        weaponLable.setForeground(Color.white);
        weaponLable.setFont(normalFont);
        playerPanel.add(weaponLable);

        weaponNameLable=new JLabel();
        weaponNameLable.setForeground(Color.white);
        weaponNameLable.setFont(normalFont);
        playerPanel.add(weaponNameLable);




        window.setVisible(true);


    }

}
