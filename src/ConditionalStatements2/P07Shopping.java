package ConditionalStatements2;
import java.util.Scanner;
public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());

        int videoCard= Integer.parseInt(scanner.nextLine());
        int processor=Integer.parseInt(scanner.nextLine());
        int ramStorage=Integer.parseInt(scanner.nextLine());

        int sumVideoCard= videoCard*250;

        double sum=sumVideoCard+ (0.35*sumVideoCard)*processor+ (0.10*sumVideoCard)*ramStorage;
          if(videoCard>processor){
              sum=sum*0.85;
          }
        if(sum>budget){
            double neededSum=sum-budget;

            System.out.printf("Not enough money! You need %.2f leva more!",neededSum);

        }
        else{
            double left=budget-sum;
            System.out.printf("You have %.2f leva left!", left);
        }
    }
}
