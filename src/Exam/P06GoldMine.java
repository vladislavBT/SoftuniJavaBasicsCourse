package Exam;
import java.util.Scanner;
public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocations=Integer.parseInt(scanner.nextLine());
        double sumOfEarnedGold=0;


        for (int i = 0; i < numLocations; i++) {
            double expectedAverageGold=Double.parseDouble(scanner.nextLine());
            int numDays=Integer.parseInt(scanner.nextLine());
            for (int j = 0; j <numDays ; j++) {
                double earnedGoldPerDay=Double.parseDouble(scanner.nextLine());
                sumOfEarnedGold+=earnedGoldPerDay;
            }
            double averageGold=sumOfEarnedGold/numDays;
            if(averageGold>=expectedAverageGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n",averageGold);
                sumOfEarnedGold=0;
            }
            else{
                System.out.printf("You need %.2f gold.%n",expectedAverageGold-averageGold);
                sumOfEarnedGold=0;
            }
        }
    }
}
