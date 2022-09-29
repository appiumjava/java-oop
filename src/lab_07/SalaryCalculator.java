package lab_07;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        FTE fte = new FTE();
        Contractor contractor = new Contractor();
        System.out.print("Enter number of FTE: ");
        Scanner scanner = new Scanner(System.in);
        int totalFTE = scanner.nextInt();
        System.out.print("Enter number of contractor: ");
        int totalContractor = scanner.nextInt();

        int totalFTESalary = totalFTE * fte.salary();
        int totalContractorSalary = totalContractor * contractor.salary();
        int totalMonthlySalary = totalFTESalary + totalContractorSalary;

        System.out.println("Total FTE's salary: " + totalFTESalary);
        System.out.println("Total Contractor's salary: " + totalContractorSalary);
        System.out.println("Total Monthly salary: "+totalMonthlySalary);
    }
}
