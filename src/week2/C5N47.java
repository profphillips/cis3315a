package week2;

import java.util.Scanner;

/**
 * Read in a ISBN-13 string and see if it is valid.
 *
 * @author John Phillips
 */
public class C5N47 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first 12 digits of an ISBN-13 string: ");
        String s = sc.nextLine();

        if (s.length() == 12) {
            int sum = 0;
            int checksum = 0;
            for (int i = 1; i <= 12; i++) {
                if (i % 2 == 0) {
                    sum += 3 * Integer.parseInt(s.substring(i - 1, i));
                } else {
                    sum += Integer.parseInt(s.substring(i - 1, i));
                }
            }
            checksum = 10 - sum % 10;
            if (checksum == 10) {
                checksum = 0;
            }
            System.out.println("The ISBN number is " + s + checksum);
        } else {
            System.out.println(s + " is invalid input");
        }
    }
}

/* Sample runs
Enter first 12 digits of an ISBN-13 string: 978013213080
The ISBN number is 9780132130806

Enter first 12 digits of an ISBN-13 string: 978013213079
The ISBN number is 9780132130790

Enter first 12 digits of an ISBN-13 string: 97801320
97801320 is invalid input
*/
