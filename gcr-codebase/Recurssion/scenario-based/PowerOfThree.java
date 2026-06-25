import java.util.Scanner;

public class PowerOfThree {

    public static boolean isPowerOfThree(
            int number) {

        if (number == 1) {
            return true;
        }

        if (number <= 0
                || number % 3 != 0) {

            return false;
        }

        return isPowerOfThree(
                number / 3);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println(
                isPowerOfThree(number));

        scanner.close();
    }
}
