package WhileLoop2;
import java.util.Scanner;
public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double needMoney=Double.parseDouble(scanner.nextLine());
        double yourMoney=Double.parseDouble(scanner.nextLine());
        int days5=0;
        int counter=0;
        while(yourMoney<needMoney){
            String spendSave= scanner.nextLine();
            double spendSavedSum=Double.parseDouble(scanner.nextLine());
            counter++;
            if(spendSave.equals("spend")){
                yourMoney=yourMoney-spendSavedSum;
                if(yourMoney<0){
                    yourMoney=0;
                }
                days5++;
            }
            else if(spendSave.equals("save")){
                yourMoney=yourMoney+spendSavedSum;
                days5=0;
            }
            if(days5==5){
                break;
            }

        }
        if(days5==5){
            System.out.printf("You can't save the money.%n%d", counter);
        }
        else {
            System.out.printf("You saved the money for %d days.", counter);
        }
    }
}
