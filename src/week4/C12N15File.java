package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write 100 ints to a file, read back in, sort into ascending order, and
 * display.
 *
 * @author John Phillips
 */
public class C12N15File {

    /**
     * Generate an array of random integers.
     *
     * @param n
     * @return an array of n random ints
     */
    public static int[] randNums(int n) {
        int[] numArray = new int[n];
        Random gen = new Random();
        for (int i = 0; i < n; i++) {
            numArray[i] = gen.nextInt();
        }
        return numArray;
    }

    /**
     * Write an array of integers separated by spaces to a file. True on the
     * FileWriter line makes it append to end of file. False causes it to create
     * a new file erasing the old data.
     *
     * @param numArray
     * @param filepath
     */
    public static void writeNums(int[] numArray, String filepath) {
        try (PrintWriter out = new PrintWriter(
                new FileWriter(new File(filepath), false))) {
            for (int myNum : numArray) {
                out.print(myNum + " ");
            }
            out.println();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(C12N15File.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(C12N15File.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Read in an unknown number of ints from a file.
     *
     * @param filepath
     * @return an array of ints
     */
    public static int[] readNums(String filepath) {
        List<Integer> myList = new ArrayList();
        try (Scanner sc = new Scanner(new File(filepath))) {
            while (sc.hasNextInt()) {
                myList.add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(C12N15File.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Converting an Integer list to an int[] array is not supported directly.
        // Java 8 adds streams which eliminates the for loop preveiously needed 
        // to do the conversion. 
        // See http://stackoverflow.com/questions/960431/how-to-convert-listinteger-to-int-in-java .
        return myList.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Display the int[] array with each number separated by a space.
     *
     * @param numsArray
     */
    public static void display(int[] numsArray) {
        for (int myNum : numsArray) {
            System.out.print(myNum + " ");
        }
        System.out.println("");
    }

    /**
     * Sort an int[] array into ascending order changing the array by reference.
     *
     * @param numsArray
     */
    public static void sortAsc(int[] numsArray) {
        Arrays.sort(numsArray);
    }

    public static void main(String[] args) {
        // generate 100 ints
        int[] array1 = randNums(100);

        // write to a file
        writeNums(array1, "C12N15.txt");
        display(array1);

        // read from a file
        int[] array2 = readNums("C12N15.txt");
        display(array2);

        // sort into ascending order
        sortAsc(array2);
        display(array2);
    }
}
