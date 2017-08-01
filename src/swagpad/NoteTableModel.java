/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import javax.swing.table.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author ajb6058
 */
public class NoteTableModel extends AbstractTableModel
{
    private String[] columnNames = {"ID","Date","Name","Description"};
    private ArrayList<Note> noteTableData = new ArrayList();
    private NoteDetailUI theNoteDetailUI;
    JTable tableTable;
    
    
    public NoteTableModel()
    {
        buildTestNoteTable();
    }

    NoteTableModel(NoteCntl theNoteCntl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList getNoteTableData()
    {
        return noteTableData;
    }
    
    public ArrayList setNoteTableData(ArrayList<Note> noteTableData)
    {
        return noteTableData;
    }
    
    public int getColumnCount()
    {
        return columnNames.length;
    }
    
    public int getRowCount()
    {
        return noteTableData.size();
    }
    
    public String getColumnName(int col)
    {
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col)
    {
        Object objectToReturn = new Object();
        switch(col)
        {
            case 0: objectToReturn = noteTableData.get(row).getNoteNumber();break;
            case 1: objectToReturn = noteTableData.get(row).getNoteDate();break;
            case 2: objectToReturn = noteTableData.get(row).getNoteName();break;
            case 3: objectToReturn = noteTableData.get(row).getDescription();break;
        }
        
        return objectToReturn;
    }
    
    public Class getColumnClass(int c)
    {
        return getValueAt(0,c).getClass();
    }
    
    public boolean isCellEditable(int row, int col)
    {
        if(col<2)
        {
            return false;
        } else 
        {
            return true;
        }
    }
    /*
    public void setValueAt(Object value, int row, int col)
    {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
    */
    public void buildTestNoteTable()
    {
        for(int i = 0; i < 100; i++)
        {
            EssayNote newNote = new EssayNote(i, SwagDate.getSwagDate(), "new test note " + i, "blah blah blah");
            noteTableData.add(newNote);
        }
    }
    
    public boolean ContainsDuplicates() //big-o notation
    {
	for(int i = 0; i < columnNames.length; i++)
	{
		for(int j = 0; j < columnNames.length; j++)
		{
			if(i == j)
			{
				continue;
			}

			if(columnNames[i] == columnNames[j])
			{
				return true;
			}
		}
	}
	return false;
    }
    
    
    public void tableSorter() // implemented to sort and filter
    {
        TableModel model = new DefaultTableModel()
         {
             public Class getColumnClass(int column) 
             {
               Class returnValue;
               if ((column >= 0) && (column < getColumnCount())) 
               {
                 returnValue = getValueAt(0, column).getClass();
               }else 
               {
                 returnValue = Object.class;
               }
               return returnValue;
             }
           };
        
        tableTable = new JTable();
           RowSorter<TableModel> sorter = new TableRowSorter<>(model);
        tableTable.setRowSorter(sorter);
    }
    
    public void deleteNote(int noteToDelete)
    {
        this.noteTableData.remove(noteToDelete);
    }
    
    public void editNote(int noteToEdit)
    {
        theNoteDetailUI = new NoteDetailUI();
        this.noteTableData.get(noteToEdit);
    }
    
}
