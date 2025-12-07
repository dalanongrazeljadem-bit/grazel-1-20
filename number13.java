* Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class g13
{
    public static void main(String[] args) {

        int[] grades = {85, 72, 95, 69, 88, 67, 76, 59, 95};
        
        int passed = 0;
        int failed = 0;

        
        for (int grade : grades) {
            if (grade > 75) {
                passed++;
            } else if (grade < 75) {
                failed++;
            }
        
        }

        System.out.println("Number of students who passed (>75): " + passed);
        System.out.println("Number of students who failed (<75): " + failed);
    }
}
