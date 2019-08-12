import java.util.Scanner;

public class SpeedOfSound {
    public static final int SOUND_SPEED_AIR = 1100;
    public static final int SOUND_SPEED_WATER = 4900;
    public static final int SOUND_SPEED_STEEL = 16400;
    static float time;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the medium (\"air\", \"water\" or \"steel\") and the distance in feet the light should travel in this medium: ");
        String medium = in.nextLine();
        int distance = in.nextInt();

        boolean ctr = false;

        if (medium.equals("air") || medium.equals("water") || medium.equals("steel") || distance > 0){
            if (medium.equals("air")){
                time = (float)distance / SOUND_SPEED_AIR;
                ctr = true;
            } else if (medium.equals("water")){
                time = (float)distance / SOUND_SPEED_WATER;
                ctr = true;
            } else if (medium.equals("steel")){
                time = (float)distance / SOUND_SPEED_STEEL;
                ctr = true;
            } else {
                System.out.println("you inserted wrong data");
                ctr = false;
            }
            };
        if (ctr){
            System.out.printf("The sound will travel %.2f seconds, in order to cover %,d feet in %s", time, distance, medium);
        }
    }
}
