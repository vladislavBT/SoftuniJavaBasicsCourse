package ConditionalStatementsAdvanced1;
import java.util.Scanner;
public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double percent=0;

        if(town.equals("Sofia")){
            if(s>=0 && s<=500){
                percent=5;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);

            }
            else if(s>500 && s<=1000){
                percent=7;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else if(s>1000 && s<=10000){
                percent=8;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else if(s>10000){
                percent=12;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else {
                System.out.println("error");
            }
        }
        else if(town.equals("Plovdiv")){
            if(s>=0 && s<=500){
                percent=5.5;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);

            }
            else if(s>500 && s<=1000){
                percent=8;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else if(s>1000 && s<=10000){
                percent=12;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else if(s>10000){
                percent=14.5;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else {
                System.out.println("error");
            }

        }
        else if(town.equals("Varna")){
            if(s>=0 && s<=500){
                percent=4.5;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);

            }
            else if(s>500 && s<=1000){
                percent=7.5;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else if(s>1000 && s<=10000){
                percent=10;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else if(s>10000){
                percent=13;
                double sum=(percent*s)/100;
                System.out.printf("%.2f", sum);
            }
            else {
                System.out.println("error");
            }
        }
        else {
            System.out.println("error");
        }
    }
}
