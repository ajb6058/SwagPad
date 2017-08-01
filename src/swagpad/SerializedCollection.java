/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import javax.swing.table.*;
import java.util.*;
import java.io.Serializable;

/**
 *
 * @author ajb6058
 */
public class SerializedCollection implements Serializable
{
    private NoteTableModel theNoteTableModel;
    
    public NoteTableModel getNoteTableModel(NoteCntl theNoteCntl)
    {
        if(theNoteTableModel == null)
        {
            theNoteTableModel = new NoteTableModel(theNoteCntl);
        }
        return theNoteTableModel;
    }
    
    public ArrayList<Note> getNoteData()
    {
        return theNoteTableModel.getNoteTableData();
    }
    
    public void setNoteData(ArrayList<Note> theNoteData)
    {
        theNoteTableModel.setNoteTableData(theNoteData);
    }
    
    public void setNoteTableModel(NoteTableModel theNewNoteTableModel)
    {
        theNoteTableModel = theNewNoteTableModel;
    }
}
