import java.util.Scanner;

public class PositiveNegativeTotalAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        int sum = 0;
        int countPositive = 0;
        int countNegative = 0;
        int numberOfNr = 0;
        System.out.println("Enter integers (to exit, enter 0 >");
        for (; running; ) {
            int nr = in.nextInt();
            if (nr == 0) {
                break;
            }
            if (nr > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            sum += nr;
            numberOfNr++;
        }
        System.out.println("The number of positives = " + countPositive);
        System.out.println("The number of negatives = " + countNegative);
        System.out.println("The total is = " + sum);
        System.out.println("The average is = " + ((double) sum / numberOfNr));

    }
}