import java.util.Scanner;

public class SumByInsert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        boolean dataFromUser = true;

        for(;dataFromUser;){
            System.out.println("Insert an integer number >");
            int i = in.nextInt();
            if(i == 0) {
                dataFromUser = false;
            } else {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
