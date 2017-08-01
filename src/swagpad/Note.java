/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author ajb6058
 */
public abstract class Note implements Printable
{
    protected String noteName = "";
    protected String noteDate = "";
    protected long noteNumber = 0;
    protected String noteDescription = "";
    
    public Note()
    {
        initNote();
    }
    
    public Note(String newNoteDate)
    {
        noteDate = newNoteDate;
        initNote();
    }
    
    public String getNoteDate()
    {
        return noteDate;
    }
    
    public void setNoteDate(String newNoteDate)
    {
        noteDate = newNoteDate;
    }
    
    public abstract void displayNote();
    
    public long getNoteNumber()
    {
        return noteNumber;
    }
    
    public String getNoteName()
    {
        return noteName;
    }
    
    public String getDescription()
    {
        return noteDescription;
    }
    public int compareTo(Object otherObject)
    {
	int result = -1;
	Note otherNote = (Note) otherObject;
	result = this.noteName.compareTo(otherNote.noteName);
	return result;
    }
    
    private void initNote()
    {
        
    }
    
    public void print()
    {
        
    }
    
}
