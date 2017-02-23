package week4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Solve C12N15 as fast as possible. Here I dump everything into main. This
 * solution would only be good for testing out a new idea or for taking a test.
 * The previous solution is preferred in most cases as the code would be easily
 * reusable in other projects.
 *
 * @author John Phillips
 */
public class C12N15QuickSolution {

    public static void main(String[] args) throws IOException {
        int[] array1 = new int[100];
        // generate 100 random ints
        Random gen = new Random();
        for (int i = 0; i < 100; i++) {
            array1[i] = gen.nextInt();
        }
        // write ints to a file separated by spaces
        PrintWriter out = new PrintWriter(new File("C12N15b.txt"));
        for (int myNum : array1) {
            out.print(myNum + " ");
        }
        out.println();
        out.close();
        // read the file back in to a new array
        int[] array2 = new int[100];
        Scanner sc = new Scanner(new File("C12N15b.txt"));
        int i = 0;
        while (sc.hasNextInt()) {
            array2[i++] = sc.nextInt();
        }
        // sort the array into ascending order
        Arrays.sort(array2);
        // display the new array
        for (int myNum : array2) {
            System.out.print(myNum + " ");
        }
    }
}
