import java.util.Scanner;
import java.util.Arrays;

public class CharArrayProgram {

    // Without toCharArray()
    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare arrays
    public static boolean compareArrays(char[] a, char[] b) {
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        char[] arr1 = getChars(str);
        char[] arr2 = str.toCharArray();

        System.out.println("Using method: " + Arrays.toString(arr1));
        System.out.println("Using toCharArray(): " + Arrays.toString(arr2));
        System.out.println("Are equal: " + compareArrays(arr1, arr2));
    }
}