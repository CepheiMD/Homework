package whiledowhile;

public class Factorials {
    static int n;
    static long fact;
    public static void main(String[] args) {
        fact = 1;
        for(n = 1; n <= 20; n++){
            fact *=n;
            System.out.printf ("%-2d %-5s %,25d\n",n , "fact = ", fact);
        }
    }
}
