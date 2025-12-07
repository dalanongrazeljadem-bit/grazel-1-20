/**
 * Write a description of class jeff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number4
{
    public static void main(String[] args) {

        int[] numbers = {45, 12, 209 , 7, 67, 24}; 

        
        int smallest = numbers[0];
        int largest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        System.out.println("Arrays: " + Arrays.toString(numbers));
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
