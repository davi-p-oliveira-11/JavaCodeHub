import java.util.Scanner;

public class WelcomeUser {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");

    String userName = scanner.nextLine();

    System.out.println("Hello, " + userName + "! Nice to meet you !");

    scanner.close();
  }
}
