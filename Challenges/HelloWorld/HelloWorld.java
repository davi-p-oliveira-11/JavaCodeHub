import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Hello, World !");

     System.out.println("Press Enter to exit...");
     scanner.nextLine();

     scanner.close();
  }
}
