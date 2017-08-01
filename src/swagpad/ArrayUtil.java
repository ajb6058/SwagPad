/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

import java.util.Random;
/**
 *
 * @author brull_000
 */
public class ArrayUtil 
{
    private static Random generator = new Random();
    
    public static int[] randomIntArray(int length, int next)
    {
        int[] a = new int[length];
        for(int i = 0; i<a.length; i++)
        {
            a[i] = generator.nextInt(next);
        }
        return a;
    }
    
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
