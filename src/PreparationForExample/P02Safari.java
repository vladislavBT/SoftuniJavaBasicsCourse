package PreparationForExample;
import java.util.Scanner;
public class P02Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget =Double.parseDouble(scanner.nextLine());
        int nights=Integer.parseInt(scanner.nextLine());
        double priceNight=Double.parseDouble(scanner.nextLine());
        int percent=Integer.parseInt(scanner.nextLine());
        if(nights>7){
            priceNight=0.95*priceNight;
        }

        double sum= (percent*0.01*budget)+(nights*priceNight);

        if(budget-sum>=0){
            double leftMoney=budget-sum;
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",leftMoney);
        }
        else if(budget-sum<0){
            double neededMoney=sum-budget;

            System.out.printf("%.2f leva needed.",neededMoney);

        }
    }
}
