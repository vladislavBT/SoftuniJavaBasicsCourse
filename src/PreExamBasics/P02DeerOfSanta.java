package PreExamBasics;
import  java.util.Scanner;
public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int missingDays=Integer.parseInt(scanner.nextLine());
        int availableFood=Integer.parseInt(scanner.nextLine());
        double firstDailyKgFood=Double.parseDouble(scanner.nextLine());
        double secondDailyKgFood=Double.parseDouble(scanner.nextLine());
        double thirdDailyKgFood=Double.parseDouble(scanner.nextLine());

        double sumOfNeededFood=missingDays*(firstDailyKgFood+secondDailyKgFood+thirdDailyKgFood);
        if(availableFood-sumOfNeededFood>=0){
            double output=Math.floor(availableFood-sumOfNeededFood);
            System.out.printf("%.0f kilos of food left.",output );
        }
        if(availableFood-sumOfNeededFood<0){
            double output2=Math.ceil(sumOfNeededFood-availableFood);
            System.out.printf("%.0f more kilos of food are needed.",output2);
        }



    }
}
