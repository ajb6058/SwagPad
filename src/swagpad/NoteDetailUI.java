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
public class NoteDetailUI extends JFrame
{
    //MainMenuCntl theMainMenuCntl;
    JPanel buttonPanel;
    JPanel notePanel;
    JTextField newNote;
    JButton back;
    JButton save;
            
    public NoteDetailUI()
    {
        
        this.initComponents();
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void initComponents()
    {
        buttonPanel = new JPanel();
        notePanel = new JPanel();
        newNote = new JTextField();
        newNote.setPreferredSize(new Dimension(250,250));
        back = new JButton("Back");
        back.addActionListener(new BackButtonListener());
        save = new JButton("Save");
        
        buttonPanel.add(back);
        buttonPanel.add(save);
        
        notePanel.add(newNote);
        
        this.getContentPane().add(buttonPanel,BorderLayout.NORTH);
        this.getContentPane().add(notePanel, BorderLayout.CENTER);
    }
    
    public class BackButtonListener implements ActionListener
    {

        /**
         *
         * @param evt
         */
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            NoteDetailUI.this.setVisible(false);
            MainMenuCntl theMainMenuCntl = new MainMenuCntl();
            //NoteCntl theNoteCntl = new NoteCntl();
            //NoteDetailUI.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
    
}