import java.util.Scanner;

public class ReverseStringRecursion {

    public static String reverseString(String text) {

        if (text.isEmpty()) {
            return text;
        }

        return reverseString(text.substring(1))
                + text.charAt(0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = scanner.nextLine();

        System.out.println(reverseString(text));

        scanner.close();
    }
}
