package swing1;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminScreen implements ActionListener {
    private JButton buttonclick;
    private JTextField enterAmt;
    private JFrame frame;
    private Container box;

    public AdminScreen(JButton c, JTextField j) {
        this.buttonclick = c;this.enterAmt = j;
        this.frame = new JFrame("currency converter application 1.1");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.box = frame.getContentPane();
        this.box.add(buttonclick, BorderLayout.SOUTH);
        this.box.add(enterAmt,BorderLayout.NORTH);
        this.buttonclick.addActionListener(this);
        this.enterAmt.addActionListener(this);
        this.frame.setSize(600,400);
        this.frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent t) {
        if (t.getSource() == this.buttonclick) {
            System.exit(0);
        }
        else if (t.getSource() == this.enterAmt) {
            System.exit(0);
        }
    }
    public void notShow() {
        this.frame.setVisible(false);
    }
    public void show() {
        this.frame.setVisible(true);
    }
}