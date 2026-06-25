import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(
            int number,
            int reversedNumber) {

        if (number == 0) {
            return reversedNumber;
        }

        return reverse(
                number / 10,
                reversedNumber * 10
                        + number % 10);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println(
                reverse(number, 0));

        scanner.close();
    }
}
