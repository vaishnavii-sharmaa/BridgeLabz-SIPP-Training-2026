import java.util.Scanner;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(
            int number) {

        if (number == 1) {
            return true;
        }

        if (number <= 0
                || number % 2 != 0) {

            return false;
        }

        return isPowerOfTwo(
                number / 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println(
                isPowerOfTwo(number));

        scanner.close();
    }
}
