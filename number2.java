/**
 * Write a description of class zel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class number2
{
    
    public static void main(String[] args){
        int [] arr = { 7,3,7,1,5,7,2,9,7,4};
        int count = 0;
        
        
        for(int num: arr){
            if (num ==7){
                count ++;
                
            }
        }
        
        System.out.println("7 appears " + count + " times.");
    }
}
