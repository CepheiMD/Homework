import java.util.Scanner;

public class MultiplicationTable {
    static int number;
    static int range;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a number and the range: ");
        number = in.nextInt();
        range = in.nextInt();
        //int result = 0;
        int r = range;
        int n = number;

        for (r = 1; r <= range; r++){
            System.out.println(n + " X " + r + " = " + (n * r));
            }
    }
}
