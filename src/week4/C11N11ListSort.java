package week4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Read in 5 numbers, store in an ArrayList, and sort them into ascending order.
 *
 * @author John Phillips
 */
public class C11N11ListSort {

    public static void sort(ArrayList<Integer> list) {
        // one way is to use a lambda expression
        // list.sort((integer, anotherInteger) -> integer.compareTo(anotherInteger));
        //
        // I came across this simpler technique on stackoverflow at
        // http://stackoverflow.com/questions/23701943/sorting-arraylist-with-lambda-in-java-8
        list.sort(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list.add(Integer.parseInt(sc.nextLine()));
        }
        sort(list);
        System.out.println("Sorted list is " + list.toString());
    }
}
