import java.util.Scanner;

public class MonthDaysCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the month number (1-12): ");
        int month = in.nextInt();
        switch (month){
            case 1: System.out.println("January has 31 days");
                break;
            case 2: System.out.println("February has 28 days in a common year and 29 day in a leap year");
                break;
            case 3: System.out.println("March ha 31 days");
                break;
            case 4: System.out.println("April has 30 days");
                break;
            case 5: System.out.println("May has 31 days");
                break;
            case 6: System.out.println("June has 30 days");
                break;
            case 7: System.out.println("July has 31 days");
                break;
            case 8: System.out.println("August has 31 days");
                break;
            case 9: System.out.println("September has 30 days");
                break;
            case 10: System.out.println("October has 31 days");
                break;
            case 11: System.out.println("November has 30 days");
                break;
            case 12: System.out.println("December has 31 days");
                break;
            default: System.out.println(month + " is not a valid month. Please insert a value between 1 and 12");
        }
    }
}
