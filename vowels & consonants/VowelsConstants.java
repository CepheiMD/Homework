import java.util.Scanner;

public class VowelsConstants {
    public static void main (String[] args) {
        boolean isVowel = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a letter from the alphabet");
        char ch = in.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U': isVowel = true;
            break;
        }
        if(isVowel == true) {
            System.out.println(ch + " is a vowel.");
        } else if (ch > 'a' && ch < 'z' || ch > 'A' && ch < 'Z') {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println(ch + " does not belong to the alphabet");
        }
    }
}

        /*Scanner in = new Scanner(System.in);
        out.println("Write a letter: ");
        char letter = in.next().charAt(0);
        switch (letter){
        case 'A' || 'E' : System.out.println("\'" + letter + "\' is a vowel!");
        break;
        case 'B' : System.out.println("\'" + letter + "\' is a consonant!");
        break;
        case 'C' : System.out.println("\'" + letter + "\' is a consonant!");
        break;
        case 'D' :
        default: out.println("Wrong character inserted");*/