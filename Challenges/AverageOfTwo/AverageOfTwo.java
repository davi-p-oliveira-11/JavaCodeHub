import java.util.Scanner;

public class AverageOfTwo {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first grade ");
    float grade1 = scanner.nextFloat();

    System.out.print("Enter the second grade: ");
    float grade2 = scanner.nextFloat();

    float average = (grade1 + grade2) / 2 ;

    System.out.printf("The average between %.1f and %.1f is equal to %.1f \n", grade1, grade2, average);

    System.out.println("Press Enter to exit...");
    scanner.nextLine();

    scanner.close();
  }
  
}
