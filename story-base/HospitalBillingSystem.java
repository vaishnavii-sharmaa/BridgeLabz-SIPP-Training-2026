class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double billAmount, double payment)
            throws InsufficientFundsException {

        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds. Need ₹"
                            + (billAmount - payment) + " more.");
        }

        System.out.println("Payment Successful!");
    }

    public static void main(String[] args) {

        String[] patients = {"Riya", "Aman", "Priya"};

        try {
            
            String input = "abc";
            int totalItems = Integer.parseInt(input);

            
            double totalBill = 5000;
            double costPerItem = totalBill / totalItems;

            
            int patientIndex = 5;
            System.out.println("Patient: " + patients[patientIndex]);

            
            processPayment(totalBill, 3000);

            System.out.println("Cost Per Item: " + costPerItem);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid number.");

        } catch (ArithmeticException e) {
            System.out.println("Billing error: Number of items cannot be zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient error: Invalid patient index.");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}