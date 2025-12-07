/**
 * Write a description of class rhaikko here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number5
{
    public static void main(String[] args) {

        int[] numbers = {10, 25, 22, 45, 55, 67};
        int target = 22; 
        System.out.println("Searching for " + target + " in " + Arrays. toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Value " + target + " found at index " + i);
                break; 
            }
        }
    }
}

