import java.util.Scanner;

public class SumFirstLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int lastDigit = number % 10; 
        
        int firstDigit = 0;
        int tempNumber = number;
        
      
        while (tempNumber != 0) {
            firstDigit = tempNumber % 10;
            tempNumber /= 10;
        }
        
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of first and last digits of " + number + " is: " + sum);
    }
}
