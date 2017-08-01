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
public class MainMenuUI extends JFrame
{
    MainMenuCntl theMainMenuCntl;
    JPanel mainPanel;
    JButton notesButton;
    JButton createNote;
    JButton schedule;
    JButton toDo;
    JButton profile;
    JButton settings;
    JButton utilities;
    JButton logOut;
    JButton about;
    JButton help;
    JButton watch;
    JButton blank;
    
         
            
    public MainMenuUI(MainMenuCntl theParentMainMenuCntl)
    {
        
        theMainMenuCntl = theParentMainMenuCntl;
        this.initComponents();
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void initComponents()
    {
        mainPanel = new JPanel(new GridLayout(6,2));
        JPanel[][] buttonGrid = new JPanel[6][2];
        for(int i = 0; i<buttonGrid.length; i++)
        {
            for(int j = 0; j<buttonGrid[i].length; j++)
            {
                buttonGrid[i][j]= new JPanel();
                mainPanel.add(buttonGrid[i][j]);
            }
        }
        
        notesButton = new JButton("Notes List");
        notesButton.addActionListener(new NotesButtonListener());
        buttonGrid[0][0].add(notesButton);
        createNote = new JButton("Create Note");
        createNote.addActionListener(new CreateNoteButtonListener());
        buttonGrid[0][1].add(createNote);
        schedule = new JButton("Schedule");
        schedule.addActionListener(new ScheduleButtonListener());
        buttonGrid[1][0].add(schedule);
        toDo = new JButton("To Do");
        toDo.addActionListener(new ToDoButtonListener());
        buttonGrid[1][1].add(toDo);
        profile = new JButton("Profile");
        profile.addActionListener(new ProfileButtonListener());
        buttonGrid[2][0].add(profile);
        settings = new JButton("Settings");
        settings.addActionListener(new SettingsButtonListener());
        buttonGrid[2][1].add(settings);
        utilities = new JButton("Utilities");
        utilities.addActionListener(new UtilitiesButtonListener());
        buttonGrid[3][0].add(utilities);
        logOut = new JButton("Log Out");
        logOut.addActionListener(new LogOutButtonListener());
        buttonGrid[3][1].add(logOut);
        about = new JButton("About");
        about.addActionListener(new AboutButtonListener());
        buttonGrid[4][0].add(about);
        help = new JButton("Help");
        help.addActionListener(new HelpButtonListener());
        buttonGrid[4][1].add(help);
        watch = new JButton("Stop Watch");
        watch.addActionListener(new WatchButtonListener());
        buttonGrid[5][0].add(watch);
        blank = new JButton("Mystery");
        buttonGrid[5][1].add(blank);
        this.getContentPane().add(mainPanel);
        
    }
    
    public class NotesButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class CreateNoteButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteDetail();
        }
    }
    
    //As of right now, only the notes and create notes button are active, all the rest bring you right to the notes page.
    
    public class ScheduleButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class ToDoButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class ProfileButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class SettingsButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class UtilitiesButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class LogOutButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            //MainMenuUI.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            MainMenuUI.this.theMainMenuCntl.getLoginCntl();
        }
    }
    
    public class AboutButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class HelpButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getNoteController();
        }
    }
    
    public class WatchButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            MainMenuUI.this.setVisible(false);
            MainMenuUI.this.theMainMenuCntl.getStopWatch();
        }
    }
}
