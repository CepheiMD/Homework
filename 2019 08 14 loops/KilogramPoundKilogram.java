package loopstwo.first;

public class KilogramPoundKilogram {
    static final float POUNDS_IN_1_KG = 2.2f;
    static float poundsCounter = 0;
    static float kiloCounter = 0;
    public static void main(String[] args) {

        System.out.printf("%-11s%-15s%-10s%10s\n","Kilograms","Pounds","Pounds","Kilograms");
        for (int i = 1, j = 20; i < 200; i++, j+=5){
            poundsCounter += POUNDS_IN_1_KG;
            kiloCounter = j/POUNDS_IN_1_KG;

            System.out.printf("%-5d%10.1f%5s%,10d%10.2f%n", i, poundsCounter,"|", j, kiloCounter);
        }
    }
}
