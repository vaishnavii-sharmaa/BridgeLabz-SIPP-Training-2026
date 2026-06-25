public class HospitalBillingSystem {

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public static void processPayment(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        try {

            int totalBill = 1000;
            int items = 0;

            System.out.println("Cost Per Item: "
                    + (totalBill / items));

        } catch (ArithmeticException e) {

            System.out.println(
                    "Cannot divide bill by zero items");
        }

        try {

            int[] patients = {101, 102, 103};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Invalid patient index");
        }

        try {

            String age = "ABC";

            int patientAge = Integer.parseInt(age);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid numeric input");
        }

        try {

            processPayment(1000, 2000);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}
