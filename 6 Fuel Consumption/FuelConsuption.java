import java.util.Scanner;

public class FuelConsuption {
    static int km;
    static float litres;
    public static void main(String[] args) {
        Scanner inputk = new Scanner(System.in);
        System.out.println("Please insert the distance in km: ");
        km = inputk.nextInt();
        Scanner inputg = new Scanner(System.in);
        System.out.println("Please insert the number of litres used: ");
        litres = inputg.nextFloat();
        float consum = litres / km;
        System.out.println("Your consumption per kilometer is: " + consum + " litres");



    }
}
