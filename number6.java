/**
 * Write a description of class six here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number6
{
    public static void main(String[] args) {
        int[] arr = {3, 8, 11, 14, 7, 20, 5};
        int sum = 0;
        int count = 0;

        for (int x : arr) {
            if (x % 2 != 0) {  
                sum += x;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers in the array.");
        }
    }
}
