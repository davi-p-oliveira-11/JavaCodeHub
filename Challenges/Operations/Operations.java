import java.util.Scanner;

public class Operations {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number1= scanner.nextInt();

    System.out.print("Enter another number: ");
    int number2 = scanner.nextInt();

    int sum = number1 + number2;
    int subtraction = number1 - number2;
    int multiplication = number1 * number2;
    int division = number1 / number2;
    int exponentiation = (int) Math.pow(number1, number2);
    int modulo = number1 % number2;

    System.out.println("The sum between " + number1+ " and " + number2 + " is equal to " + sum + ".");
    System.out.println("The subtraction of "+ number1+ " by " + number2 + " is equal to " + subtraction + ".");
    System.out.println("The multiplication of " + number1+ " by " + number2 + " is equal to " + multiplication + ".");
    System.out.println("The division of " + number1+ " by " + number2 + " is equal to " + division + ".");
    System.out.println("The exponentiation of " + number1+ " by " + number2 + " is equal to " + exponentiation + ".");
    System.out.println("The modulo of " + number1+ " divided by " + number2 + " is equal to " + modulo + ".");

    scanner.close();
  }

}
