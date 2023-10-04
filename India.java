import java.util.Scanner;
public class India {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the country : ");
    String country = scanner.nextLine();
    if(country.equals("india")) {
      System.out.println("enter the age");
      int age = scanner.nextInt();
      if(age>=18) {
        System.out.println("person is elegible for vote");
      } else {
        System.out.println("person is not eligible for vote");
      }
    }
    else {
      System.out.println("you are not eligible to vote in india");
    }
  }
}