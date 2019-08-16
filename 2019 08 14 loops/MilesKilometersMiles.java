package loopstwo.first;

public class MilesKilometersMiles {
    static final float KILOMETERS_IN_1_MILES = 1.609f;
    static float milesCounter = 0;
    static float kilometerCounter = 0;
    public static void main(String[] args) {

        System.out.printf("%-10s%9s%15s%10s\n","Miles","Kilometers","Kilometers","Miles");
        for (int i = 1, j = 20; i <= 10; i++, j+=5){
            milesCounter += KILOMETERS_IN_1_MILES;
            kilometerCounter = j/KILOMETERS_IN_1_MILES;

            System.out.printf("%-5d%10.4f%5s%,10d%15.3f%n", i, milesCounter,"|", j, kilometerCounter);
        }
    }
}
