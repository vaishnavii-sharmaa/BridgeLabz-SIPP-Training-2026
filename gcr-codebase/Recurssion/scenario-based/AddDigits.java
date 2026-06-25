import java.util.Scanner;

public class AddDigits {

    public static int findDigitSum(
            int number) {

        if (number == 0) {
            return 0;
        }

        return (number % 10)
                + findDigitSum(number / 10);
    }

    public static int addDigits(
            int number) {

        if (number < 10) {
            return number;
        }

        return addDigits(
                findDigitSum(number));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println(
                addDigits(number));

        scanner.close();
    }
}
