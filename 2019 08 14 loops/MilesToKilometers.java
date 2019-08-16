package loopstwo.first;

public class MilesToKilometers {
    static final float MILES_IN_1_KM = 1.609f;
    static float milesCounter = 0;
    public static void main(String[] args) {
        //System.out.println("Miles     Kilometers");
        System.out.printf("%-10s%-15s\n","Miles","Kilometers");
        for (int i = 1; i <= 10; i++){
            milesCounter += MILES_IN_1_KM;
            //System.out.println(i +"        " + milesCounter);
           System.out.printf("%-5d %10.4f%n", i, milesCounter);
        }
    }
}
