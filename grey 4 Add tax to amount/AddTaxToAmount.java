import java.util.Scanner;

public class AddTaxToAmount {
    final static float ADD_TAX = 1.05f;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the amount in USD: ");
        float usd = in.nextFloat();
        float tax = usd * ADD_TAX;
        System.out.println("Your amount of " + usd + " USD with taxes would be " + tax + " USD");
    }
}
