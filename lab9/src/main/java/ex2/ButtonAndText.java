package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ButtonAndText extends JFrame{

    JButton Increment;
    JTextField Text;
    private int counter=0;

    ButtonAndText(){
        setTitle("Incrementare:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500,700);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);
        int width = 80;
        int height = 20;

        Text = new JTextField("" +counter);
        Text.setBounds(70,50,width, height);

        Increment = new JButton("+1");
        Increment.setBounds(10,150,width, height);
        Increment.addActionListener(new ButtonListener());

        add(Text);add(Increment);
    }

    public static void main(String[] args) {
        new  ButtonAndText();
    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event) {
            if(event.getSource()==Increment) {
                counter++;
                ButtonAndText.this.Text.setText(" " + counter);
            }
        }
    }
}
