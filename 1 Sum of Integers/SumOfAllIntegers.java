import java.util.Scanner;

public class SumOfAllIntegers {
    static int number1;
    static int number2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert 2 integers: ");
        number1 = in.nextInt();
        number2 = in.nextInt();
        int result = 0;


        for (int i = number1; i <= number2; i++) {
            result += +i;

        }
        System.out.println(result);
    }
}
