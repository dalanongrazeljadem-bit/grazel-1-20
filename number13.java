/**
 * Write a description of class no13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no13
{
   public static void main(String[] args) {

        int[] grades = {85, 72, 95, 69, 88, 67, 76, 59, 95};
        
        int passed = 0;
        int failed = 0;

        // Loop through the array
        for (int grade : grades) {
            if (grade > 75) {
                passed++;
            } else if (grade < 75) {
                failed++;
            }
            // If grade == 75, it is ignored (neither pass nor fail)
        }

        System.out.println("Number of students who passed (>75): " + passed);
        System.out.println("Number of students who failed (<75): " + failed);
    }
}
