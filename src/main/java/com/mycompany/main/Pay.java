package com.mycompany.main;
import java.util.Scanner;

public class Pay {

    @SuppressWarnings("resource")
	public static void computeSalary () {
    	
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

     

        // Get the employee's hourly rate
        System.out.print("Enter the employee's hourly rate: ");
        float hourlyRate = scanner.nextFloat();

        // Get the number of hours worked
        System.out.print("Enter the number of hours worked: ");
        float hoursWorked = scanner.nextFloat();

        // Calculate the employee's weekly pay
        float weeklyPay = hourlyRate * hoursWorked;
        
        // Get the employee's additional allowances
        System.out.print("Enter additional allowances: ");
        float additonalAllowances = scanner.nextFloat();
        
     // Calculate the deductions
        double sssDeduction = 0;
        float pagibigDeduction = 0;
        float philhealthDeduction = 0;

        if (weeklyPay < 3250) {
            sssDeduction = 135;
        } else if (weeklyPay < 3750) {
            sssDeduction = 157.50; }
          else if (weeklyPay < 4250) {
            sssDeduction = 180;
          }  else if (weeklyPay < 4750) {
            sssDeduction = 202.50; }
          else if (weeklyPay < 5250) {
              sssDeduction = 225; }
          else if (weeklyPay < 5750) {
              sssDeduction = 247.50; }
          else if (weeklyPay < 6250) {
              sssDeduction = 270; }
          else if (weeklyPay < 6750) {
              sssDeduction = 292.50; }
          else if (weeklyPay < 7250) {
              sssDeduction = 315; }
          else if (weeklyPay < 7750) {
              sssDeduction = 337.50; }
          else if (weeklyPay < 8250) {
              sssDeduction = 360; }
          else if (weeklyPay < 8750) {
              sssDeduction = 382.50; }
          else if (weeklyPay < 9250) {
              sssDeduction = 405; }
          else if (weeklyPay < 9750) {
              sssDeduction = 427.50; }
          else  if (weeklyPay < 10250) {
              sssDeduction = 450; }
          else if (weeklyPay < 10750) {
              sssDeduction = 472.50; }
          else   if (weeklyPay < 11250) {
              sssDeduction = 495; }
          else if (weeklyPay < 11750) {
              sssDeduction = 517.50; }
          else if (weeklyPay < 12250) {
              sssDeduction = 540; }
          else  if (weeklyPay < 12750) {
              sssDeduction = 562.50; }
          else if (weeklyPay < 13250) {
              sssDeduction = 585; }
          else if (weeklyPay < 13750) {
              sssDeduction = 607.50; }
          else if (weeklyPay < 14250) {
              sssDeduction = 630; }
          else if (weeklyPay < 14750) {
              sssDeduction = 652.50; }
          else if (weeklyPay < 15250) {
              sssDeduction = 675; }
       

        if (weeklyPay > 1500) {
            pagibigDeduction = (weeklyPay * 2) / 100;
        } else {
            pagibigDeduction = 0;
        }

        if (pagibigDeduction > 100) {
            pagibigDeduction = 100;
        }

        philhealthDeduction = (weeklyPay * 3) / 100;
        
        float TotalDeductions = (float) (sssDeduction + pagibigDeduction + philhealthDeduction);

        // Calculate the net weekly salary
        float NetWeeklySalary = (float) (weeklyPay - sssDeduction - pagibigDeduction - philhealthDeduction);

        // Calculate the tax
        float withholdtax = 0;

        if (NetWeeklySalary < 20832) {
        	withholdtax = 0;
        } else {
        	withholdtax = (NetWeeklySalary - 20832) * 20 / 100;
        }


        // Set the company title and sub-heading
        String companyTitle = "MOTOR PH";
        String subheading = "PAYROLL SUMMARY";
        

        // Print the company title and sub-heading
        System.out.println("** " + companyTitle + " **");
        System.out.println(subheading);

     
        
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Weekly Pay: " + weeklyPay);
        
        System.out.println("Additional Allowances: " + additonalAllowances);
        
        String deductions = "DEDUCTIONS";
        System.out.println(deductions);
        
        System.out.println("SSS deduction:" + sssDeduction);
        System.out.println("PhilHealth deduction:" + philhealthDeduction);
        System.out.println("Pag-Ibig deduction:" + pagibigDeduction);    
        System.out.println("Total deductions:" + TotalDeductions);
        System.out.println("Withholding Tax:" + withholdtax);
        System.out.println("NET Weekly Salary:" + NetWeeklySalary);
        
        
        	
        
    }
}
