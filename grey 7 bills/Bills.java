import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your amount in USD");
        int amount = in.nextInt();
        int bill20 = amount / 20;
        int bill10 = (amount % 20) / 10;
        int bill5 = (amount - bill20 * 20 - bill10 * 10) / 5;
        int bill1 = amount - bill20 * 20 - bill10 * 10 - bill5 * 5 ;
        System.out.println("$20 bills: " + bill20 + "\n$10 bills: " + bill10 + "\n$ 5 bills: " + bill5 + "\n$ 1 bills: " + bill1);
    }
}
