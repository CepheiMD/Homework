package whiledowhile;

import java.util.Scanner;

public class BarChartPrintingTable {
    static int i;
    static int j;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert 7 numbers from 1 to 30!");
        //boolean dataFromUser = true;

        for (int i = 0; i < 5; i++) {
            int numberOne = in.nextInt();
            if (numberOne < 1 || numberOne > 30) {
                System.out.println("Out of range (1 - 30)! Retry!");
                numberOne = in.nextInt();
            }
                for (j = 1; j <= numberOne; j++) {
                    System.out.printf("%s","*");
                }
                System.out.println();
            }
        }

    }


