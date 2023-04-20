package Exam;
import java.util.Scanner;
public class P02BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fan= scanner.nextLine();
        double budget=Double.parseDouble(scanner.nextLine());
        double numCans=Double.parseDouble(scanner.nextLine());
        double numPackets=Double.parseDouble(scanner.nextLine());

        double bearPrice=numCans*1.20;
        double priceOnePacketChips=bearPrice*0.45;
        double priceChips=Math.ceil(priceOnePacketChips*numPackets);

        double sum=priceChips+bearPrice;

        if(budget>=sum){
            System.out.printf("%s bought a snack and has %.2f leva left.",fan,budget-sum);
        }
        else{
            double sum2=sum-budget;
            System.out.printf("%s needs %.2f more leva!",fan,sum2);
        }

    }
}
