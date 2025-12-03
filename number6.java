/**
 * Write a description of class xrey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number6
{
    public static void main(String[] args) {

        // Sample array of food numbers (e.g., calorie counts, item quantities, etc.)
        int[] foodNumbers = {50, 120, 200, 80, 150};

        int sum = 0;

        // Loop to compute the sum of all numbers
        for (int i = 0; i < foodNumbers.length; i++) {
            sum += foodNumbers[i];
        }

        // Compute average
        double average = (double) sum / foodNumbers.length;

        System.out.println("Total of food numbers: " + sum);
        System.out.println("Average of food numbers: " + average);
    
    }
}
