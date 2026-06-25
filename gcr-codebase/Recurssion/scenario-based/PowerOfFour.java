import java.util.Scanner;

public class PowerOfFour {

    public static boolean isPowerOfFour(
            int number) {

        if (number == 1) {
            return true;
        }

        if (number <= 0
                || number % 4 != 0) {

            return false;
        }

        return isPowerOfFour(
                number / 4);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println(
                isPowerOfFour(number));

        scanner.close();
    }
}
