/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author brull_000
 */
public class StopWatch 
{
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;
    
    //Constructs a stopwatch
    
    public StopWatch()
    {
        reset();
    }
    
    //Starts stopwatch
    
    public void start()
    {
        if(isRunning) 
        {
            return;
        }
        isRunning = true;
        startTime = System.currentTimeMillis();
    }
    
    //Stops stopwatch
    
    public void stop()
    {
        if(!isRunning)
        {
            return;
        }
        isRunning = false;
        long endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }
    
    //Returns total elapsed time
    
    public long getElapsedTime()
    {
        if(isRunning)
        {
            long endTime = System.currentTimeMillis();
            return elapsedTime=endTime-startTime;
        }
        else
        {
            return elapsedTime;
        }
    }
    
    //Resets stopWatch
    
    public void reset()
    {
        elapsedTime = 0;
        isRunning = false;
    }
}
