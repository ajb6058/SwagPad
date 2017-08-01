/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author brull_000
 */
import java.io.Serializable;

/**
 *
 * @author ajb6058
 */
public class User implements Serializable
{
    private String userName;
    public User(String theUserName)
    {
        userName = theUserName;
    }
    
    public void setUserName(String theUserName)
    {
        userName = theUserName;
    }
    
    public String getUserName()
    {
        return userName;
    }
}
