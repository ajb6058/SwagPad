/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ajb6058
 */
public class LoginCntl //for easiest log in, enter user1, password1
{
    private UserList theUserList;
    private LoginUI theLoginUI;
    private ArrayList<String> authenticatedUsers;
    private ArrayList<String> authenticatedPasswords;
    
    public LoginCntl()
    {
        LoginUI theLoginUI = new LoginUI(this);
    }
    
    public void getMainMenuCntl()
    {
        MainMenuCntl theMainMenuCntl = new MainMenuCntl();
        
    }

    public boolean authenticate(String username, String password)
    {
        boolean authentication;
        //do {
            theUserList = new UserList();
            authenticatedUsers = new ArrayList();
            authenticatedUsers = theUserList.getValidUsers();
        
            authenticatedPasswords = new ArrayList();
            authenticatedPasswords = theUserList.getValidPasswords();
            for (int i = 0; i < authenticatedUsers.size(); i++) 
            {
                if (authenticatedUsers.get(i).equals(username) && authenticatedPasswords.get(i).equals(password)) 
                {
                    authentication = true;
                    return authentication;
                }
            }
            JOptionPane.showMessageDialog(null, "what you have entered is invalid", "Error Message", JOptionPane.ERROR_MESSAGE);
            authentication = false;
            return authentication;
        //}while(authentication = false);
    }
}
