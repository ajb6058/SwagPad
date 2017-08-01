/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author ajb6058
 */
public class EssayNote extends Note
{
    public EssayNote(String newNoteDate)
    {
        super(newNoteDate);
    }
    
    public String getNoteDate()
    {
        return super.getNoteDate();
    }
    
    public EssayNote(long newNoteNumber, String newNoteDate, String newNoteName, String newNoteDescription)
    {
        //super(newNoteDate);
        this.noteNumber = newNoteNumber;
        this.noteDate = newNoteDate;
        this.noteName = newNoteName;
        this.noteDescription = newNoteDescription;
    }
    
    public void displayNote()
    {
        
    }
    
    public void pageSetup()
    {
        //I promise that I will work all weekend to implement this
    }
    
    public void printPreview()
    {
        //I promise that I will work all weekend to implement this
    }
    
    public void print()
    {
        //I promise that I will work all weekend to implement this
    }
}
