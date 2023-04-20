package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double sum= 0;

        if(budget<=100){
            String destination ="Bulgaria";
            System.out.printf("Somewhere in %s%n", destination);
            if(season.equals("summer")){
                sum= 0.30*budget;
                System.out.printf("Camp - %.2f",sum);
            }
            else if(season.equals("winter")){
                sum= 0.70*budget;
                System.out.printf("Hotel - %.2f",sum);
            }
        }
        else if(budget>100 && budget<=1000){
            String destination ="Balkans";
            System.out.printf("Somewhere in %s%n", destination);
            if(season.equals("summer")){
                sum= 0.40*budget;
                System.out.printf("Camp - %.2f",sum);
            }
            else if(season.equals("winter")){
                sum= 0.80*budget;
                System.out.printf("Hotel - %.2f",sum);
            }
        }
        else if(budget>1000){
            String destination ="Europe";
            System.out.printf("Somewhere in %s%n", destination);
            sum=0.90*budget;
            System.out.printf("Hotel - %.2f",sum);
        }



    }

}
