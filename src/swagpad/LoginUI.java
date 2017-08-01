/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import javax.swing.*;       //j-frame
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ajb6058
 */
public final class LoginUI extends JFrame
{
    LoginCntl theLoginCntl;
    JButton cancelButton;
    JButton submitButton;
    JTextField username;
    JPasswordField password;
    JLabel usernameLabel;
    JLabel passwordLabel;
    JPanel mainPanel;
    JPanel buttonPanel;
    JPanel fieldPanel;
    
    
    public LoginUI(LoginCntl theCreatingCntl)
    {
        this.theLoginCntl = theCreatingCntl;
        this.initComponents();
        this.setSize(300, 200);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void initComponents()
    {
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new CancelListener());
        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitListener());
        username = new JTextField();
        //username.setColumns(10);
        username.setPreferredSize(new Dimension(200,40));
        password = new JPasswordField();
        password.setPreferredSize(new Dimension(200,40));
        password.setEchoChar('*');
        //password.setColumns(10);
        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        mainPanel = new JPanel(new BorderLayout());
        buttonPanel = new JPanel(new FlowLayout());
        fieldPanel = new JPanel(new GridLayout(5,2));
        fieldPanel.add(usernameLabel);
        fieldPanel.add(username);
        fieldPanel.add(passwordLabel);
        fieldPanel.add(password);
        buttonPanel.add(cancelButton);
        buttonPanel.add(submitButton);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        mainPanel.add(fieldPanel, BorderLayout.CENTER);
        this.add(mainPanel);
        
    }
    
    public class SubmitListener implements ActionListener
    {

        /**
         *
         * @param evt
         */
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            System.out.println("Submit button pressed");
            String usernameToPass = username.getText();
            String passwordToPass = password.getText();
            System.out.println("Username and Password:" + usernameToPass+" "+passwordToPass);
            boolean tOrF = theLoginCntl.authenticate(usernameToPass, passwordToPass);
            if(tOrF == true)
            {
                LoginUI.this.setVisible(false);
                theLoginCntl.getMainMenuCntl();
                //LoginUI.this.theLoginCntl.getMainMenuCntl();
            }else
            {
                LoginUI.this.setVisible(false);
                LoginCntl theLoginCntl = new LoginCntl();
            }
        }
    }
    
    public class CancelListener implements ActionListener
    {

        /**
         *
         * @param evt
         */
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            System.out.println("Cancel button pressed");
            System.exit(1);
        }
    }
    
}
