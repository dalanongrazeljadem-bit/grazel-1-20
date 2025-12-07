/**
 * Write a description of class zel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class number2
{
    public static void main(String[] args){
        int [] num = { 7,8,7,1,5,7,2,9,7,4,};
        int count = 0;
        for(int x: num)
            if (x==7)
                count ++;
        System.out.println("Array: " + Arrays.toString(num));
        System.out.println("Number 7 appears "+ count);
    }
}
