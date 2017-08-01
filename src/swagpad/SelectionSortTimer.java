/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import java.util.Scanner;
/**
 *
 * @author brull_000
 */
public class SelectionSortTimer 
{
    public void timer()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int next = in.nextInt();
        
        //construct random array
        
        int[] randomArray = ArrayUtil.randomIntArray(next, 100);
        
        StopWatch timer = new StopWatch();
        
        timer.start();
        SelectionSorter.sort(randomArray);
        timer.stop();
        
        System.out.println("Elapsed time: "+ timer.getElapsedTime() + " milliseconds");
    }
}
