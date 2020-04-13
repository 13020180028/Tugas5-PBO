import java.util.Arrays;

/**
 *
 * @author arby
 */
public class UrutArray {

    public static void main(String[] args) {
        String[] stringArray = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};
        System.out.println("****** Unsorted String Array *******");
        for (String x: stringArray) {
            System.out.print(x+" ");
        }
        Arrays.sort(stringArray);

        System.out.println("\n* Sorted String Array *******");
        for (String x: stringArray) {
            System.out.print(x+" ");
        }
    }
}
