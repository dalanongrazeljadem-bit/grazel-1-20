/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class g10
{
   public static void main(String[] args) {
        int[] numbers = {5, 14, 7, 12, 9};
        int target = 14;

        int index = -1;  

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;       
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("First index of " + target + " is: " + index);
    }
}
