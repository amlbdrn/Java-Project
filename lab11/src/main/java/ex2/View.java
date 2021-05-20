package ex2;

import ex1.Observable;

import javax.swing.*;

public class View extends JFrame {

    private JButton add;
    private JButton view;
    private JButton delete;
    private JButton change;

    private JList<Product> products;

    private JTextField change_quantity;
    private JTextField name;
    private JTextField price;
    private JTextField quantity;

    public JButton getAdd() {
        return add;
    }

    public JButton getView() {
        return view;
    }

    public JButton getDelete() {
        return delete;
    }

    public JButton getChange() {
        return change;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public void setView(JButton view) {
        this.view = view;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public void setChange(JButton change) {
        this.change = change;
    }

    public View() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
