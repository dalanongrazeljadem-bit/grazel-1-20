/**
 * Write a description of class no13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no14
{
    public static void main(String[] args) {

        int[] arr = { 5, 10, 15, 20,25,30 };

        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
