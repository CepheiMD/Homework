import java.util.Scanner;

public class LetterToNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please insert one of the following letters: \"A, B, C, D or F\": ");
        char letter = in.next().charAt(0);
        if (letter == 'A') {
            System.out.println ("4");
        } else if (letter == 'B') {
            System.out.println ("3");
        } else if (letter == 'C') {
            System.out.println ("2");
        } else if (letter == 'D') {
            System.out.println ("1");
        } else if (letter == 'F') {
            System.out.println ("0");
        } else {
            System.out.println (letter + " is invalid grade");
        }
    }
}
