package PreExamBasics;
import java.util.Scanner;
public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people=Integer.parseInt(scanner.nextLine());
        String season= scanner.nextLine();

        double sum=0;

        if(season.equals("spring")){
            if(people<=5){
                sum=people*50.00;
                System.out.printf("%.2f leva.", sum);
            }
            else{
                sum=people*48.00;
                System.out.printf("%.2f leva.", sum);
            }
        }
        else if(season.equals("summer")){
            if(people<=5){
                sum=(people*48.50)*0.85;
                System.out.printf("%.2f leva.", sum);
            }
            else{
                sum=(people*45.00)*0.85;
                System.out.printf("%.2f leva.", sum);
            }
        }
        else if(season.equals("autumn")){
            if(people<=5){
                sum=people*60.00;
                System.out.printf("%.2f leva.", sum);
            }
            else{
                sum=people*49.50;
                System.out.printf("%.2f leva.", sum);
            }
        }
        else if(season.equals("winter")){
            if(people<=5){
                sum=(people*86.00)*1.08;
                System.out.printf("%.2f leva.", sum);
            }
            else{
                sum=(people*85.00)*1.08;
                System.out.printf("%.2f leva.", sum);
            }
        }
    }
}
