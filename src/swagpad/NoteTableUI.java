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
public class NoteTableUI extends JFrame
{
    MainMenuUI theMainMenuUI;
    MainMenuCntl theMainMenuCntl;
    NoteDetailUI theNoteDetailUI;
    NoteCntl theNoteCntl;
    JPanel buttonPanel;
    JPanel tablePanel;
    JTable theNoteTable;
    JScrollPane theScrollPane;
    JButton back;
    JButton delete;
    JButton edit;
    JButton newButton;
    
    public NoteTableUI(NoteCntl theParentNoteCntl)
    {
        theNoteCntl = theParentNoteCntl;
        this.initComponents();
        this.setSize(480, 500);
        this.setLocationRelativeTo(null);
        this.setTitle("Notes List");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void initComponents()
    {
        buttonPanel = new JPanel();
        tablePanel = new JPanel();
        back = new JButton("Back");
        back.addActionListener(new BackButtonListener());
        delete = new JButton("Delete");
        delete.addActionListener(new DeleteButtonListener());
        edit = new JButton("Edit");
        edit.addActionListener(new EditButtonListener());
        newButton = new JButton("New");
        newButton.addActionListener(new NewButtonListener());
        
        
        theNoteTable = new JTable(theNoteCntl.getNoteTableModel());
        theScrollPane = new JScrollPane(theNoteTable);
        theNoteTable.setFillsViewportHeight(true);
        tablePanel.add(theScrollPane,BorderLayout.CENTER);
        
        buttonPanel.add(back);
        buttonPanel.add(delete);
        buttonPanel.add(edit);
        buttonPanel.add(newButton);
        
        this.getContentPane().add(buttonPanel,BorderLayout.NORTH);
        this.getContentPane().add(tablePanel,BorderLayout.CENTER);
        
    }
    
    public class DeleteButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            int selectedRow = theNoteTable.getSelectedRow();
            NoteTableUI.this.theNoteCntl.deleteNote(selectedRow);
            NoteTableUI.this.theNoteCntl.getNoteTableModel().fireTableRowsDeleted(selectedRow, selectedRow);
        }
    }
    
    public class NewButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            theNoteDetailUI = new NoteDetailUI();
        }
    }
    
    public class EditButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            int selectedRow = theNoteTable.getSelectedRow();
            NoteTableUI.this.theNoteCntl.editNote(selectedRow);
            NoteTableUI.this.theNoteCntl.getNoteTableModel().fireTableCellUpdated(selectedRow, selectedRow);
        }
    }
    
    public class BackButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent evt)
        {
            NoteTableUI.this.setVisible(false);
            MainMenuCntl theMainMenuCntl = new MainMenuCntl();
        }
    }
}
