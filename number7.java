/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class f7{
    public static void main(String[] args) {
        int[] data = {10, -5, 22, -8, 17};

        int[] fixedArray = Arrays.copyOf(data, data.length);

        for (int i = 0; i < fixedArray.length; i++) {
            if (fixedArray[i] < 0) {
                fixedArray[i] *= -1;  
            }
        }

        System.out.println("Initial array: " + Arrays.toString(data));
        System.out.println("After conversion: " + Arrays.toString(fixedArray));
    }
}
