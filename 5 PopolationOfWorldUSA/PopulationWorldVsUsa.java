import java.util.Scanner;

public class PopulationWorldVsUsa {
    static double world;
    static double usa;
    public static void main(String[] args) {
        Scanner inputw = new Scanner (System.in);
        System.out.println("Please insert the population of the world: ");
        world = inputw.nextLong();
        Scanner inputu = new Scanner(System.in);
        System.out.println("Please insert the population of the USA: ");
        usa = inputu.nextLong();
        double percent = (usa / world * 100);
        System.out.println("The population of the USA is " + percent + "% " + "of the world population.");
    }
}