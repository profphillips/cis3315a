package week4;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Retrieve and process a large file of data from a url.
 *
 * @author John Phillips
 */
public class C12N25 {

    public static void main(String[] args) {
        double assistantTotal = 0;
        double associateTotal = 0;
        double fullTotal = 0;
        double allTotal = 0;
        int assistantCount = 0;
        int associateCount = 0;
        int fullCount = 0;
        int allCount = 0;
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                String[] sa = sc.nextLine().split(" ");
                String rank = sa[2];
                double salary = Double.parseDouble(sa[3]);
                if (rank.equalsIgnoreCase("assistant")) {
                    assistantTotal += salary;
                    assistantCount++;
                } else if (rank.equalsIgnoreCase("associate")) {
                    associateTotal += salary;
                    associateCount++;
                } else {
                    fullTotal += salary;
                    fullCount++;
                }
                allTotal += salary;
                allCount++;
            }
            System.out.printf("%-30s %12.2f\n", "Assistant Salary Total", assistantTotal);
            System.out.printf("%-30s %12.2f\n", "Associate Salary Total", associateTotal);
            System.out.printf("%-30s %12.2f\n", "Full Professor Salary Total", fullTotal);
            System.out.printf("%-30s %12.2f\n", "All Faculty Salary Total", allTotal);
            System.out.println("");
            System.out.printf("%-30s %12.2f\n", "Assistant Salary Average", assistantTotal / assistantCount);
            System.out.printf("%-30s %12.2f\n", "Associate Salary Average", associateTotal / associateCount);
            System.out.printf("%-30s %12.2f\n", "Full Professor Salary Average", fullTotal / fullCount);
            System.out.printf("%-30s %12.2f\n", "All Faculty Salary Average", allTotal / allCount);

        } catch (MalformedURLException ex) {
            Logger.getLogger(C12N25.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(C12N25.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
