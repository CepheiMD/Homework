package whiledowhile;
import java.util.Scanner;

class FindTheSmallestValue {
    static int first;
    static int second;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert a value:");
        first = in.nextInt();
        boolean addNext = true;
        System.out.println("Insert next " + (first - 1) + " values: ");
        int smallestInteger = 2147483647;

        for(int i = 1;addNext; i++){
            if (i < first){
                second = in.nextInt();
                if (smallestInteger > second){
                    smallestInteger = second;
                };
                addNext = true;
            } else {
                addNext = false;
            }
        }
        if (first > smallestInteger){
            System.out.println("Min value is: " + smallestInteger);
        } else {
            System.out.println("Min value is: " + first);
        }
    }
}
