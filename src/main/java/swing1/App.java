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

public class App {

    public static void main(String[] args) {
        JButton userClick = new JButton("User");
        JButton adminClick = new JButton("Admin");
        UserAdmin StartScreen = new UserAdmin(userClick, adminClick);
    }
}

