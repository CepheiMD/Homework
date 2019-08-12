import java.util.Scanner;

public class PositiveNegativeZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five numbers >");
        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer c = in.nextInt();
        Integer d = in.nextInt();
        int countOfNegativeNumbers = 0;
        int countOfPositiveNumbers = 0;
        int countOfZeroes = 0;

        if(a > 0) {
            countOfPositiveNumbers++;
        } else if (a < 0)  {
            countOfNegativeNumbers++;
        } else {
            countOfZeroes++;
        };
        if (b > 0) {
            countOfPositiveNumbers++;
        } else if (b < 0) {
            countOfNegativeNumbers++;
        } else {
            countOfZeroes++;
        }

        if(c > 0) {
            countOfPositiveNumbers++;
        } else if (c < 0) {
            countOfNegativeNumbers++;
        } else {
            countOfZeroes++;
        }
        if (d > 0) {
            countOfPositiveNumbers++;
        } else if (d < 0) {
            countOfNegativeNumbers++;
        } else {
            countOfZeroes++;
        }
        System.out.println("Positive: " + countOfPositiveNumbers + "\nNegative: " + countOfNegativeNumbers + "\nZeroes: " + countOfZeroes);
    }
}
