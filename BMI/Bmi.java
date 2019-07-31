import java.util.Scanner;

public class Bmi {
    static int feet;
    static int inches;
    static int pounds;

    public static void main(String[] args) {
        Scanner inputf = new Scanner(System.in);
        System.out.println("Please insert your height in feet (first feet and then inches");
        System.out.println("insert feet: ");
        feet = inputf.nextInt();
        Scanner inputi = new Scanner(System.in);
        System.out.println("insert inches: ");
        inches = inputi.nextInt();
        Scanner inputw = new Scanner(System.in);
        System.out.println("Please insert your weight in pounds");
        pounds = inputw.nextInt();
        int hfi = feet * 12;
        float htotal = (hfi + inches) * 0.0254f;
        float wkg = pounds / 2.2f;
        float bmi = wkg / (htotal * htotal);
        System.out.println("For your parameters: height=" + feet + "," + inches + " and Weight =" + pounds + ", BMI is equal to: " + bmi);
    }
}
