/**
 * Write a description of class NO12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NO12
{
    public static void main(String[] args) {
        
        int[] arr = { 5, 2, 7, 5, 3, 7, 8, 7 };
        int target = 7;
        int count = 0;

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
            if (count >= 3) {
                break;
            }
        }

        if (count >= 3) {
            System.out.println(target + " appears at least 3 times in the array.");
        } else {
            System.out.println(target + " appears less than 3 times in the array.");
        }
    }
}
