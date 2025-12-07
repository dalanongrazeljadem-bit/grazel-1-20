/**
 * Write a description of class number here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number1
{
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number= new int [1];
        int num;
        
        do{
            System.out.print("Enter a number between 1 and 100: ");
            num =in.nextInt( );
            
        } while ( num < 1 || num > 100);
        number[0] = num;
        
        System.out.println("You Entered the number: " + number [0]);
        }
    }



            
        
