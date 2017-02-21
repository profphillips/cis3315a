package week4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Administrator
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
        Integer[] array = {5, 6, 4};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(array));
        System.out.println("Max is " + max(list));
    }
}
