import java.util.Scanner;

public class DistanceTraveled {
    static int hours;
    static int speed;
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert speed in MPH and the number of hours traveled");
        speed = in.nextInt();
        hours = in.nextInt();
        int distance = 0;
        int h = hours;
        //System.out.printf("10s%10$-10s%1$\n", "Hour", "Distance Traveled");

        for(h = 1; h <= hours; h++){
            distance = speed * h;
            System.out.println(h + " " + distance);
            //System.out.printf("%10d %d", h, s * h);
        }
    }
}
