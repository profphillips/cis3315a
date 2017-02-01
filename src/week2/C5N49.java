package week2;

import java.util.Scanner;

/**
 * Display counts of vowels and consonants in a String.
 *
 * @author John Phillips
 */
public class C5N49 {

    public static void main(String[] args) {
        int consonants = 0;
        int vowels = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                        || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                        || s.charAt(i) == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
/*
Enter a string: Programming is fun
The number of vowels is 5
The number of consonants is 11
*/
