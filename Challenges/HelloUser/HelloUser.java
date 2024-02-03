import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");

    String userName = scanner.nextLine();

    System.out.println("Hello, " + userName + "! Nice to meet you !");

    System.out.println("Press Enter to exit...");
    scanner.nextLine();

    scanner.close();
  }
}
