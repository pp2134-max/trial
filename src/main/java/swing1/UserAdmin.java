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

public class UserAdmin implements ActionListener {
    private JButton userClick;
    private JButton adminClick;
    private JFrame frame;
    private Container box;
    private UserScreen userScreen;
    public boolean isVisible;
    public Password password;

    public UserAdmin(JButton c, JButton c2) {
        this.userClick = c;
        this.adminClick = c2;
        this.frame = new JFrame("currency converter application 1.1");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.isVisible = true;

        this.box = frame.getContentPane();
        this.box.add(userClick, BorderLayout.WEST);
        this.box.add(adminClick, BorderLayout.EAST);
        this.userClick.addActionListener(this);
        this.adminClick.addActionListener(this);
        this.frame.setSize(600, 400);
        this.frame.setVisible(true);

        //create other screens
        JButton buttonuse = new JButton("convert money using exchange rate");
        JTextField enterAmt = new JTextField("Enter amount: ");
        this.userScreen = new UserScreen(buttonuse, enterAmt);
        this.userScreen.notShow();

        //set password
        JButton cancel = new JButton("cancel");
        JPasswordField adminPw = new JPasswordField(8);
        this.password = new Password(cancel, adminPw, this);
        this.password.notShow();
    }

    public void actionPerformed(ActionEvent t) {
        if (t.getSource() == this.userClick) {
            this.notShow();
            this.userScreen.show();
        } else if (t.getSource() == this.adminClick) {
            this.notShow();
            this.password.show();
        }
    }

    public void notShow() {
        this.frame.setVisible(false);
        this.isVisible = false;
    }

    public void show() {
        this.frame.setVisible(true);
        this.isVisible = true;
    }
}