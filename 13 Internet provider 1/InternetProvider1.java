import java.util.Scanner;

public class InternetProvider1 {
    public static final float PACK_A_FEE = 9.95f;
    public static final float PACK_B_FEE = 13.95f;
    public static final float PACK_C_FEE = 19.95f;
    public static final int PACK_A_HOURS = 10;
    public static final int PACK_B_HOURS = 20;
    public static final int PACK_A_ADD_HOURS = 2;
    public static final int PACK_B_ADD_HOURS = 1;
    public static float fee;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your package (A, B or C) and number of hours used: ");
        char pckge = in.next().charAt(0);
        int hours = in.nextInt();
        boolean ctr = false;

        if (pckge == 'A' || pckge == 'B' || pckge == 'C' || hours > 0) {
            if (pckge == 'A' && hours > PACK_A_HOURS) {
                    fee = PACK_A_FEE + (hours - PACK_A_HOURS) * PACK_A_ADD_HOURS;
                    ctr = true;
                } else if (pckge == 'A' && hours <= PACK_A_HOURS){
                    fee = PACK_A_FEE;
                    ctr = true;
                } else if (pckge == 'B' && hours > PACK_B_HOURS) {
                    fee = PACK_B_FEE + (hours - PACK_B_HOURS) * PACK_B_ADD_HOURS;
                    ctr =true;
                } else  if (pckge == 'B' && hours <= PACK_B_HOURS){
                    fee = PACK_B_FEE;
                    ctr = true;
                } else if (pckge == 'C') {
                fee = PACK_C_FEE;
                ctr = true;
            } else {
                ctr = false;
                System.out.println("You inserted wrong data");
            };

             if (ctr) {
                 System.out.println("Your bill for the package " + pckge + " is: " + fee + " $.");
            }
        }
    }
}