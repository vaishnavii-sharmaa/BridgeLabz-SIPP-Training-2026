import java.util.Scanner;

public class FibonacciRecursion {

    public static int fibonacci(int number) {

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return fibonacci(number - 1)
                + fibonacci(number - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int number = scanner.nextInt();

        System.out.println(
                fibonacci(number));

        scanner.close();
    }
}
