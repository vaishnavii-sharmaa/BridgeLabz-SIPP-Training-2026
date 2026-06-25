import java.util.Scanner;

public class PowerRecursion {

    public static long findPower(
            int base,
            int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base *
                findPower(
                        base,
                        exponent - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int base = scanner.nextInt();

        System.out.print("Enter Exponent: ");
        int exponent = scanner.nextInt();

        System.out.println(
                findPower(base, exponent));

        scanner.close();
    }
}
