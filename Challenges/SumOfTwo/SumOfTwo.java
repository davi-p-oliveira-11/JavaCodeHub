import java.util.Scanner;

public class SumOfTwo {
  
   public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number1 = scanner.nextInt();

    System.out.print("Enter another number: ");
    int number2 = scanner.nextInt();

    int sumOfTwo = number1 + number2;

    System.out.printf("The sum of %d and %d is %d", number1, number2, sumOfTwo);

    scanner.close();
   }

}
