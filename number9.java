/**
 * Write a description of class number9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class number9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
                      
         while (num != 0) {
    
            sum += num;
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
             
        }

        System.out.println("Total Sum is = " + sum);
        sc.close();
    }
}
