/**
 * Write a description of class number11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class number11
{
    public static void main(String[] args) {
        int[] numbers = {5,10,15,20,25,30,35,40,45,50};

        for (int i = 0; i < numbers.length; i += 2) {  // even indexes only
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
