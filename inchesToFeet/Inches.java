import java.util.Scanner;

public class Inches {
    static int inch; //inches

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your value in inches: ");
        inch = input.nextInt();
        int feet = inch / 12;
        int f = feet * 12;
        int r = inch - f;
        System.out.println(inch + " inches is equal to " + feet + " feet and " + r + " inches!");
    }

}
