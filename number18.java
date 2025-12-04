/**
 * Write a description of class no13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class no18{
      public static void main(String[] args) {
        int[] arr = { 6, 9, 7, 6, 9, 8 };

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean hasDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) {
                break;
            }
        }

        if (hasDuplicate) {
            System.out.println("The array contains duplicate values.");
        } else {
            System.out.println("The array does not contain duplicate values.");
        }
    }
}
