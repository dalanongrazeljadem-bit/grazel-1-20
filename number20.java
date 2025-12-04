/**
 * Write a description of class no13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class no20{

 public static void main(String[] args) {

        int[] numbers = {22,14,17,25,28,29,11,10};

        System.out.println("Even numbers greater than 20:");

        for (int num : numbers) {
            if (num > 20 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
