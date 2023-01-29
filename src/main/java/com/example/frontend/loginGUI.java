package com.example.frontend;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginGUI {

    JFrame frame;
    JPanel panel;
    JLabel userLabel, passwordLabel;
    JTextField userText;
    JPasswordField userPassword;
    
    public loginGUI() {

        panel = new JPanel();
        panel.setLayout(null);


        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        userLabel = new JLabel("Username");
        userLabel.setBounds(10,20,80,25); // x,y,w,h
        
        panel.add(userLabel);

        userText = new JTextField(25);
        userText.setBounds(100,20,165,25);

        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);

        panel.add(passwordLabel);

        userPassword = new JPasswordField();
        userPassword.setBounds(100,50, 165, 25);

        panel.add(userPassword);

        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        new loginGUI();
    }

}
