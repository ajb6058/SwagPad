/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import java.util.*;
/**
 *
 * @author ajb6058
 */
public class UserList 
{
    private ArrayList<String> validUsers;
    private ArrayList<String> validPasswords;

    public UserList()
    {
        validUsers = new ArrayList();
        validPasswords = new ArrayList();

        validUsers.add("user1");
        validUsers.add("user2");
        validUsers.add("user3");
        validUsers.add("user4");
        validUsers.add("user5");

        validPasswords.add("password1");
        validPasswords.add("password2");
        validPasswords.add("password3");
        validPasswords.add("password4");
        validPasswords.add("password5");
    }

    public ArrayList getValidUsers()
    {
        return validUsers;
    }
    
    public ArrayList getValidPasswords()
    {
        return validPasswords;
    }
}
