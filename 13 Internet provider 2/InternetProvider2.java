import java.util.Scanner;

public class InternetProvider2 {
    public static final float PACK_A_FEE = 9.95f;
    public static final float PACK_B_FEE = 13.95f;
    public static final float PACK_C_FEE = 19.95f;
    public static final int PACK_A_HOURS = 10;
    public static final int PACK_B_HOURS = 20;
    public static final int PACK_A_ADD_HOURS = 2;
    public static final int PACK_B_ADD_HOURS = 1;
    public static float inCaseA;
    public static float inCaseB;
    public static char pck;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your package (A, B or C) and number of hours used: ");
        pck = in.next().charAt(0);
        int hours = in.nextInt();

        if (pck == 'A' || pck == 'B' || pck == 'C' && hours > 0) {
            if (hours > PACK_A_HOURS) {
                inCaseA = PACK_A_FEE + (hours - PACK_A_HOURS) * PACK_A_ADD_HOURS;
            } else {
                inCaseA = PACK_A_FEE;
            }
            if (hours > PACK_B_HOURS) {
                inCaseB = PACK_B_FEE + (hours - PACK_B_HOURS) * PACK_B_ADD_HOURS;
            } else {
                inCaseB = PACK_B_FEE;
            }
        } else {
            System.out.println("You inserted wrong data");
        }
        ;
        if (pck == 'A' && inCaseA < inCaseB && inCaseA < PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseA + " $");
        } else if (pck == 'A' && inCaseA > inCaseB && inCaseA < PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseA + " $");
            System.out.println("You would save " + (inCaseA - inCaseB) + " $ if you would choose the package B.");
        } else if (pck == 'A' && inCaseA < inCaseB && inCaseA > PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseA + " $");
            System.out.println("You would save " + (inCaseA - PACK_C_FEE) + " $ if you would choose the package C.");
        } else if (pck == 'A' && inCaseA > inCaseB && inCaseA > PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseA + " $");
            System.out.println("You would save " + (inCaseA - inCaseB) + " $ if you would choose the package B, or " +
                    (inCaseA - PACK_C_FEE) + " $ if you would choose the package C.");
        }
        ;

        if (pck == 'B' && inCaseB < inCaseA && inCaseB < PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseB + " $");
        } else if (pck == 'B' && inCaseB > inCaseA && inCaseB < PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseB + " $");
            System.out.println("You would save " + (inCaseB - inCaseA) + " $ if you would choose the package A.");
        } else if (pck == 'B' && inCaseB < inCaseA && inCaseB > PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseB + " $");
            System.out.println("You would save " + (inCaseB - PACK_C_FEE) + " $ if you would choose the package C.");
        } else if (pck == 'B' && inCaseB > inCaseA && inCaseB > PACK_C_FEE) {
            System.out.println("For the package " + pck + " your monthly bill is " + inCaseB + " $");
            System.out.println("You would save " + (inCaseB - inCaseA) + " $ if you would choose the package A, or " +
                    (inCaseB - PACK_C_FEE) + " $ if you would choose the package C.");

        }
        ;

        if (pck == 'C' && PACK_C_FEE < inCaseA && PACK_C_FEE < inCaseB) {
            System.out.println("For the package " + pck + " your monthly bill is " + PACK_C_FEE + " $");
        } else if (pck == 'C' && PACK_C_FEE > inCaseA && PACK_C_FEE < inCaseB) {
            System.out.println("For the package " + pck + " your monthly bill is " + PACK_C_FEE + " $");
            System.out.println("You would save " + (PACK_C_FEE - inCaseA) + " $ if you would choose the package A.");
        } else if (pck == 'C' && PACK_C_FEE < inCaseA && PACK_C_FEE > inCaseB) {
            System.out.println("For the package " + pck + " your monthly bill is " + PACK_C_FEE + " $");
            System.out.println("You would save " + (PACK_C_FEE - inCaseB) + " $ if you would choose the package B.");
        } else if (pck == 'C' && PACK_C_FEE > inCaseA && PACK_C_FEE > inCaseB) {
            System.out.println("For the package " + pck + " your monthly bill is " + PACK_C_FEE + " $");
            System.out.println("You would save " + (PACK_C_FEE - inCaseA) + " $ if you would choose the package A, or " +
                    (PACK_C_FEE - inCaseB) + " $ if you would choose the package B.");
        };
    }
}