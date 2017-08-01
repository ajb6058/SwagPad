/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ajb6058
 */
public class Sandbox extends JFrame
{
    JPanel thePanel;
    
    
    public Sandbox()
    {
        this.setSize(400,300);
        this.setTitle("Layouts");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.getContentPane().add(new JButton("test1"), BorderLayout.NORTH);
        this.getContentPane().add(new JButton("test2"), BorderLayout.SOUTH);
        GridLayout theGrid = new GridLayout(5,2);
        JPanel centerPanel = new JPanel(theGrid);
        
        for(int i = 0; i<10; i++)
        {
            centerPanel.add(new JButton(Integer.toString(i)));
        }
        
        this.getContentPane().add(centerPanel, BorderLayout.CENTER);
    }
}
