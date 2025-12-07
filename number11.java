/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class g11
{
    public static void main(String[] args) {
        int[] numbers = {13, 2, 9, 18, 27};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Elements at even indices:");

        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
    }
}
