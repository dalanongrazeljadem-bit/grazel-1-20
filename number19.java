/**
 * Write a description of class no13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class no19{
    public static void main(String[] args) {
        
        
        String[] names = {"hannah", "grazel", "reshea", "jafet", "jefrrey"};
        
        int[] grades = {85, 92, 76, 88, 95};
        System.out.println("Student Grades:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " = " + grades[i]);
        }
    }
}
