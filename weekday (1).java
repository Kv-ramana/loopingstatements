
import java.util.Scanner;

public class weekday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a week number (1-7):");
        int week = sc.nextInt();
        sc.close();
        String day = "";
        switch (week) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid week number";
                break;
        }
        System.out.println("The week day is: " + day);
    }
}
