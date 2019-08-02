import java.util.Scanner;

public class Seconds {
    static final int HOURS_IN_DAY = 24;
    static final int MINUTES_IN_HOUR = 60;
    static final int SECONDS_IN_MINUTE = 60;
    static final int SECONDS_IN_HOUR = 3600;
    static final int SECONDS_IN_DAY = 86400;

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Please insert the number of seconds: ");
        long x = inputs.nextInt();

        long dayCount = x / SECONDS_IN_DAY;
        long hourCount = (x % SECONDS_IN_DAY) / SECONDS_IN_HOUR;
        long minuteCount = ((x % SECONDS_IN_DAY) % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        long secondsCount = ((x % SECONDS_IN_DAY) % SECONDS_IN_HOUR) % 60;


        System.out.println(dayCount + " " + hourCount + " " + minuteCount + " " + secondsCount);
    }
}
