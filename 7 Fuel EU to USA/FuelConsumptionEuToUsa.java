import java.util.Scanner;

public class FuelConsumptionEuToUsa {
    final static int DIST_KM = 100;
    final static float DIST_MILES = 62.14f;
    final static float GALLONS_ONE_LITER = 3.3875f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your consumption in litres per 100 KM: ");
        float litres = in.nextFloat();
        float gallons = GALLONS_ONE_LITER * litres;
        float mpg = DIST_MILES/ gallons;
        System.out.println("Your consumption of " + litres + " litres per 100 km, would equivalate to " + mpg + " miles per gallon!");
    }
}
