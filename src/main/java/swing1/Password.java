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

public class Password implements ActionListener {
    private JButton cancel;
    public JPasswordField adminPassword;
    private JLabel label;
    private JFrame frame;
    private Container box;
    private AdminScreen adminScreen;
    private UserAdmin userAdmin;
    public boolean isVisible;

    public Password(JButton c, JPasswordField adminPassword, UserAdmin userAd) {
        this.cancel = c;this.adminPassword = adminPassword;
        this.label = new JLabel("Enter admin password in textfield at the bottom");
        this.frame = new JFrame("currency converter application 1.1");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.box = frame.getContentPane();
        this.box.add(cancel, BorderLayout.NORTH);
        this.box.add(adminPassword,BorderLayout.SOUTH);
        this.box.add(this.label, BorderLayout.CENTER);
        this.cancel.addActionListener(this);
        this.adminPassword.addActionListener(this);
        this.frame.setSize(600,400);
        this.frame.setVisible(true);
        this.isVisible = true;


        JButton buttonuse = new JButton("convert money using exchange rate");
        JTextField enterAmt = new JTextField("Enter amount: ");
        this.adminScreen = new AdminScreen(buttonuse, enterAmt);
        this.adminScreen.notShow();

        this.userAdmin = userAd;
    }

    public void actionPerformed(ActionEvent t) {
        if (t.getSource() == this.cancel) {
            this.notShow();
            this.isVisible = false;
            this.userAdmin.show();
        }
        else if (t.getSource() == this.adminPassword) {
            char[] entered = this.adminPassword.getPassword();
            this.passwordChecker(entered);
        }
    }
    public void notShow() {
        this.frame.setVisible(false);
    }

    public void show() {
        this.frame.setVisible(true);
    }

    public void passwordChecker(char[] entered) {
        char[] passw = {'s','o','f','t','2','4','1','2'};
        if (entered.length != 8) {
            this.label.setText("Password Failed! Try again");
            return;
        }
        else if (!(Arrays.equals(entered, passw))) {
            this.label.setText("Password Failed! Try again");
            return;
        }
        this.notShow();
        this.isVisible = false;
        this.adminScreen.show();
    }
}