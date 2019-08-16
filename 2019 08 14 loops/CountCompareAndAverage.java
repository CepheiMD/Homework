package loopstwo.first;

import java.util.Scanner;

public class CountCompareAndAverage {
    static int number;
    static int next;
    static int minim;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean validation = true;
        int smallestInteger = 2147483647;
        System.out.println("Enter an integer! (enter 0 to exit and compute): ");

        for (; validation; ) ;
        if (number != 0) {
            System.out.println("Enter the next integer ");
            number = in.nextInt();
            validation = true;
            if (number > smallestInteger) {
                minim = smallestInteger;
            } else {
                minim = number;
            }
        }else if (number == 0){
            System.out.println("Smallest number is: " + minim);
            validation = false;
        }

        }
    }


