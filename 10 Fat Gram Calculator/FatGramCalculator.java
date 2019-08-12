import java.util.Scanner;

public class FatGramCalculator {
    final static byte CALORIES_IN_1G_FAT = 9;
    static int calories;
    static float fatGrams;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the number of calories and the fat grams in your food: ");
        calories = in.nextInt();
        fatGrams = in.nextFloat();
        float caloriesFromFat = fatGrams * CALORIES_IN_1G_FAT;
        float percentageOfCalories = caloriesFromFat / (float)calories;
        float caloriesFromFatInTotalCalories = caloriesFromFat/ calories * 100;

        System.out.printf("For %,d calories and %.2f fat grams, the percentage of calories from fat is %.2f\n", calories, fatGrams, percentageOfCalories);

        if(caloriesFromFatInTotalCalories < 30.0){
            System.out.println("The food is low in fat!");
        }
    }
}
