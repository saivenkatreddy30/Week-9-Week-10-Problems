import java.util.Scanner;

public class SubstringProgram {

    // Create substring using charAt()
    public static String mySubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Compare strings
    public static boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = mySubstring(str, start, end);
        String sub2 = str.substring(start, end);

        System.out.println("Using charAt(): " + sub1);
        System.out.println("Using substring(): " + sub2);
        System.out.println("Are equal: " + compare(sub1, sub2));
    }
}