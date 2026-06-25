
import java.util.Scanner;

public class FactorialRecursion {

    public static long factorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        System.out.println("Factorial = " + factorial(number));

        scanner.close();
    }
}