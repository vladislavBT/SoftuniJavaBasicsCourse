package ConditionalStatements2;
import java.util.Scanner;
public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice= Double.parseDouble(scanner.nextLine());


        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int puffyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numToys=puzzle+doll+puffyBears+minions+trucks;

        double toysPrice= puzzle*2.60+doll*3+puffyBears*4.10+minions*8.20+trucks*2;

        if(numToys>=50){
            double money;
            money=toysPrice*0.75;
            money=money*0.90;
            if(money<tripPrice){
                double neededMoney=tripPrice-money;
                System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
            }
            else{
                double leftMoney=money-tripPrice;
                System.out.printf("Yes! %.2f lv left." , leftMoney);
            }

        }
        else{
            double money= 0.90*toysPrice;
            if(money<tripPrice){
                double neededMoney=tripPrice-money;

                System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
            }
            else{
                double leftMoney=money-tripPrice;
                System.out.printf("Yes! %.2f lv left." , leftMoney);
            }

        }
        }


    }

