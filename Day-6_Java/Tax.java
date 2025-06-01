package Practice.TaxCalculation;
import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Annual Salary (INR): ");
        double salary = scanner.nextDouble();

        System.out.print("Enter Age (in years): ");
        int age = scanner.nextInt();

        System.out.print("Enter Investment in Tax-saving Instruments (INR): ");
        double investment80C = scanner.nextDouble();

        System.out.print("Enter Health Insurance Premium Paid (INR): ");
        double healthInsurance80D = scanner.nextDouble();

        System.out.print("Enter Home Loan Interest Paid (INR): ");
        double homeLoanInterest = scanner.nextDouble();

        double deduction80C = Math.min(investment80C, 150000);
        double deduction80D = Math.min(healthInsurance80D, age >= 60 ? 50000 : 25000);
        double deductionSection24 = Math.min(homeLoanInterest, 200000);

        double totalDeductions = deduction80C + deduction80D + deductionSection24;
        double taxableIncome = Math.max(0, salary - totalDeductions);

        System.out.println("\n--- Tax Summary ---");
        System.out.printf("Total Income: ₹%.2f%n", salary);
        System.out.printf("Total Deductions: ₹%.2f%n", totalDeductions);
        System.out.printf("  > Section 80C Deduction: ₹%.2f%n", deduction80C);
        System.out.printf("  > Section 80D Deduction: ₹%.2f%n", deduction80D);
        System.out.printf("  > Section 24 Deduction : ₹%.2f%n", deductionSection24);
        System.out.printf("Taxable Income: ₹%.2f%n", taxableIncome);

        double totalTax = calculateTaxWithBreakdown(taxableIncome, age);
        System.out.printf("Total Tax Owed: ₹%.2f%n", totalTax);
    }

    public static double calculateTaxWithBreakdown(double income, int age) {
        double tax = 0;
        double slab1Limit;
        double taxSlab1 = 0, taxSlab2 = 0, taxSlab3 = 0;

        if (age < 60) {
            slab1Limit = 250000;
        } else if (age <= 80) {
            slab1Limit = 300000;
        } else {
            slab1Limit = 500000;
        }

        if (income <= slab1Limit) {
            tax = 0;
        } else {
            double remaining = income;

            if (remaining > slab1Limit) {
                double slabAmount = Math.min(remaining - slab1Limit, 250000); // ₹2.5L slab
                taxSlab1 = slabAmount * 0.05;
            }

            if (income > 500000) {
                double slabAmount = Math.min(remaining - 500000, 500000); // ₹5L to ₹10L slab
                taxSlab2 = slabAmount * 0.20;
            }

            if (income > 1000000) {
                double slabAmount = remaining - 1000000; // Above ₹10L
                taxSlab3 = slabAmount * 0.30;
            }

            tax = taxSlab1 + taxSlab2 + taxSlab3;
        }

        System.out.println("\n--- Tax Slab Breakdown ---");
        if (taxSlab1 > 0) System.out.printf("Section 5%% on ₹%.0f: ₹%.2f%n", Math.min(income - slab1Limit, 250000), taxSlab1);
        if (taxSlab2 > 0) System.out.printf("Section 20%% on ₹%.0f: ₹%.2f%n", Math.min(income - 500000, 500000), taxSlab2);
        if (taxSlab3 > 0) System.out.printf("Section 30%% on ₹%.0f: ₹%.2f%n", income - 1000000, taxSlab3);

        if (tax == 0) {
            System.out.println("No tax applicable as income is within exemption limit.");
        }
        return tax;
    }
}
