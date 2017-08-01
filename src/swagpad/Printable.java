/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swagpad;

/**
 *
 * @author ajb6058
 */
public interface Printable 
{
    //Really, really need to define the units for this.
    public final double MAX_PRINTABLE_AREA = 100000.00;
    
    public void print();
    
    //public void print(String printerName);
    //^^^the above is overloading the print class
    
    public void printPreview();
    
    public void pageSetup();
    
    
}
