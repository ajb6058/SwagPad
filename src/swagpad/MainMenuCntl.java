/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author ajb6058
 */
public class MainMenuCntl
{
    
    public MainMenuCntl()
    {
        MainMenuUI theMainMenuUI = new MainMenuUI(this);
    }
    
    public void getNoteController()
    {
        NoteCntl theNoteCntl = new NoteCntl();
    }
    
    public void getLoginCntl()
    {
        LoginCntl theLoginCntl = new LoginCntl();
    }
    
    public void getNoteDetail()
    {
        NoteDetailUI theNoteDetailUI = new NoteDetailUI();
    }
    
    public void getStopWatch()
    {
        StopWatch theStopWatch = new StopWatch();
    }
}
