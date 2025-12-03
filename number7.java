/**
 * Write a description of class number7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number7
{
   public static void main(String[] args) {
        int[] numbers = { -5, 3,4,-17 -12, 7, -1 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = -numbers[i]; // convert negative to positive
            }
        }

        // Display result
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
