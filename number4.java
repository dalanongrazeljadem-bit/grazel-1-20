/**
 * Write a description of class jeff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number4
{
    public static void main(String[] args) {

        int[] numbers = {45, 12, 209 , 7, 67, 24}; // sample array

        // Initialize smallest and largest with the first element
        int smallest = numbers[0];
        int largest = numbers[0];

        // One loop only
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
