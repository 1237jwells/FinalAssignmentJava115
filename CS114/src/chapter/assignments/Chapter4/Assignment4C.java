package chapter.assignments.Chapter4;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import static java.lang.System.in;

/**
 * Created by 1237jwells on 1/23/2017.
 */
public class Assignment4C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String employeeName;

        double hoursWorked;
        double hourlyPayRate;
        double federalTaxRate;
        double stateTaxRate;
        double grossPay;
        double federalWithholding;
        double stateWithholding;
        double totalDeduction;
        double netPay;
        char dollarChar = '$';



        System.out.println("Enter employee's name: ");
        employeeName = input.nextLine();
        System.out.println("Enter the number of hours worked input a week: ");
        hoursWorked = input.nextInt();
        System.out.println("Enter hourly pay rate: ");
        hourlyPayRate = input.nextDouble();
        System.out.println("Enter federal tax rate: ");
        federalTaxRate = input.nextDouble();
        System.out.println("Enter state tax rate: ");
        stateTaxRate = input.nextDouble();

        grossPay = hoursWorked*hourlyPayRate;
        federalWithholding = grossPay*federalTaxRate;
        stateWithholding = grossPay*stateTaxRate;
        totalDeduction = federalWithholding+stateWithholding;
        netPay = grossPay-totalDeduction;


        System.out.printf("Employee Name: %10s\n", employeeName);
        System.out.printf("Hours Worked: %9.2f \n", hoursWorked);
        System.out.printf("Pay Rate: %9s%.2f \n", dollarChar, hourlyPayRate);
        System.out.printf("Gross Pay: %8s%.2f \n", dollarChar, grossPay);
        System.out.println("Deductions");
        System.out.printf("Federal Withholding: %6s%.2f \n", dollarChar, federalWithholding);
        System.out.printf("State Withholding: %8s%.2f \n", dollarChar, stateWithholding);
        System.out.printf("Total Deduction: %10s%.2f \n", dollarChar, totalDeduction);
        System.out.printf("Net Pay: %10s%.2f \n", dollarChar, netPay);

        //System.out.println(employeeName+hoursWorked+hourlyPayRate+federalTaxRate+stateTaxRate);

    }
}
