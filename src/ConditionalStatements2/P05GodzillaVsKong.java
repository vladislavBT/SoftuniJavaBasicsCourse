package ConditionalStatements2;
import java.util.Scanner;
public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget= Double.parseDouble(scanner.nextLine());
        int numSupernumerary=Integer.parseInt(scanner.nextLine());
        double prizeClothing=Double.parseDouble(scanner.nextLine());

        double myBudget=0.90*budget;
        if(numSupernumerary>150){
          double newPrizeClothing=0.90*prizeClothing;
          if(myBudget-(numSupernumerary*newPrizeClothing)<0){
              double money=(numSupernumerary*newPrizeClothing)-myBudget;
              System.out.println("Not enough money!");
              System.out.printf("Wingard needs %.2f leva more.", money);
          }
          else {
              double money=myBudget-(numSupernumerary*newPrizeClothing);
              System.out.println("Action!");
              System.out.printf("Wingard starts filming with %.2f leva left.", money);
          }
        }

        else{
            if(myBudget-(numSupernumerary*prizeClothing)<0){
                double money=(numSupernumerary*prizeClothing)-myBudget;
                System.out.println("Not enough money!");
                System.out.printf("Wingard needs %.2f leva more.", money);
            }
            else {
                double money=myBudget-(numSupernumerary*prizeClothing);
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", money);
            }

        }
    }
}
