/**
 * Write a description of class rhaikko here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number5
{
    public static void main(String[] args) {

        int[] numbers = {10, 25, 37, 42, 55, 67};
        int target = 42; // the value we want to find

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Value " + target + " found at index " + i);
                break; // stop the loop immediately
            }
        }
    }
}
