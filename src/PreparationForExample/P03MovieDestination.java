package PreparationForExample;
import java.util.Scanner;
public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());

        String destination= scanner.nextLine();
        String season=scanner.nextLine();
        int numDays=Integer.parseInt(scanner.nextLine());
        double sum=0;
        if(destination.equals("Dubai")){
            if(season.equals("Winter")){
                sum = 0.70*(numDays*45000);
            }
            if(season.equals("Summer")){
                sum = 0.70*(numDays*40000);
            }

        }
        else if(destination.equals("Sofia")){
            if(season.equals("Winter")){
                sum = 1.25*(numDays*17000);
            }
            if(season.equals("Summer")){
                sum = 1.25*(numDays*12500);
            }

        }
        else if(destination.equals("London")){
            if(season.equals("Winter")){
                sum =numDays*24000;
            }
            if(season.equals("Summer")){
                sum =numDays*20250;
            }
        }
        if(budget-sum>=0){

            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget-sum);

        }
        else {
            System.out.printf("The director needs %.2f leva more!", sum-budget);
        }

    }
}
