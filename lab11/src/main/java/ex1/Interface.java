package ex1;

import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame implements Observer {

    public final JTextField display;

    Interface() {
        this.display=new JTextField();
        display.setEditable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 60);
        this.setLayout(new GridLayout(1,3));

        this.add(display);
        this.setVisible(true);
    }

    @Override
    public void update(Object event){
        display.setText("Temperature: " + event);
    }
}
