import java.util.Scanner;

public class KingdomTaxSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter citizen's income: ");
        double income = sc.nextDouble();

        double tax = 0;
        String bracket = "";

        if (income < 10000) {
            tax = income * 0.05;
            bracket = "5% Tax Bracket";
        } else if (income <= 50000) {
            tax = income * 0.15;
            bracket = "15% Tax Bracket";
        } else {
            tax = income * 0.30;
            bracket = "30% Tax Bracket";
        }

        System.out.println("\nCitizen Tax Details");
        System.out.println("Income      : " + income);
        System.out.println("Tax Bracket : " + bracket);
        System.out.println("Tax Amount  : " + tax);

        
        double[] incomes = {
                8000, 12000, 25000, 55000, 70000,
                9500, 30000, 45000, 60000, 15000
        };

        double totalTaxCollected = 0;

        System.out.println("\nTax Report for 10 Citizens");
        System.out.println("--------------------------------");

        for (int i = 0; i < incomes.length; i++) {

            double citizenTax;

            if (incomes[i] < 10000) {
                citizenTax = incomes[i] * 0.05;
            } else if (incomes[i] <= 50000) {
                citizenTax = incomes[i] * 0.15;
            } else {
                citizenTax = incomes[i] * 0.30;
            }

            totalTaxCollected += citizenTax;

            System.out.println("Citizen " + (i + 1)
                    + " | Income: " + incomes[i]
                    + " | Tax: " + citizenTax);
        }

        System.out.println("--------------------------------");
        System.out.println("Total Tax Collected = " + totalTaxCollected);

        sc.close();
    }
}