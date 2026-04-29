import java.util.Scanner;
import java.util.Arrays;

public class SplitWithoutMethod {

    // Find length without length()
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }

    // Split using charAt()
    public static String[] mySplit(String str) {
        int len = findLength(str);

        // Count words (spaces + 1)
        int words = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int index = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                result[index++] = temp;
                temp = "";
            }
        }
        result[index] = temp; // last word

        return result;
    }

    // Compare arrays
    public static boolean compareArrays(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] arr1 = mySplit(text);
        String[] arr2 = text.split(" ");

        System.out.println("Using charAt(): " + Arrays.toString(arr1));
        System.out.println("Using split(): " + Arrays.toString(arr2));
        System.out.println("Are equal: " + compareArrays(arr1, arr2));
    }
}