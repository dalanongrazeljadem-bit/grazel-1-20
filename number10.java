/**
 * Write a description of class number10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number10
{
    public static void main(String[] args) {
        int[] numbers = {5, 14, 7, 12, 9};
        int target = 14;

        int index = -1;  // stores result

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;  // store first index
                break;       // stop early
            }
        }

        System.out.println("First index of " + target + " is: " + index);
    }
}
