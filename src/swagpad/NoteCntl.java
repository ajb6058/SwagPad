/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author ajb6058
 */
public class NoteCntl 
{
    private NoteTableUI theNoteTableUI;
    private NoteDetailUI theNoteDetailUI;
    private NoteTableModel theNoteTableModel = new NoteTableModel();
    
    public NoteCntl()
    {
        theNoteTableUI = new NoteTableUI(this);
    }
    
    public NoteTableModel getNoteTableModel()
    {
        return theNoteTableModel;
    }
    
    public void getNoteDetailUI(Note theNote)
    {
        if(theNoteDetailUI == null || theNote == null)
        {
            //idk
        }
    }
            
    public void deleteNote(int noteToDelete)
    {
        theNoteTableModel.deleteNote(noteToDelete);
    }
    
    public void editNote(int noteToEdit)
    {
        theNoteTableModel.editNote(noteToEdit);
    }
}
