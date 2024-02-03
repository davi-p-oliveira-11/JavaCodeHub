package Challenges.EmployeeName;

import java.util.Scanner;

public class EmployeeName {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the Employee Name: ");
    String userName = scanner.nextLine();

    System.out.print("Enter the Month Worked: ");
    String monthWorked = scanner.nextLine();

    System.out.print("What is the value of the employee salary ? : ");
    float userSalary = scanner.nextFloat();

    scanner.nextLine();

    System.out.printf("The Employee %s has a salary of %.2f in %s \n", userName, userSalary, monthWorked);

    System.out.println("Press Enter to exit...");
    scanner.nextLine();

    scanner.close();
  }
}
