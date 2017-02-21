package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Read in a series of numbers ended by 0. Store in an ArrayList. Write a method
 * that returns the largest number.
 *
 * @author John Phillips
 */
public class C11N4 {

    public static Integer max(ArrayList<Integer> list) {
        int biggest;
        if (list.size() > 0) {
            biggest = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > biggest) {
                    biggest = list.get(i);
                }
            }
            return biggest;
        }
        return null;
    }

    public static void main(String[] args) {
        //Integer[] array = {5, 6, 4};
        //ArrayList<Integer> list = new ArrayList(Arrays.asList(array));
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        System.out.print("Enter a number (end with 0): ");
        while (sc.hasNext()) {
            int num = Integer.parseInt(sc.nextLine());
            if (num == 0) {
                break;
            }
            list.add(num);
            System.out.print("Enter a number (end with 0): ");
        }
        System.out.println("Max is " + max(list));
    }
}
