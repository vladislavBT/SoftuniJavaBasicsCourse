package PreExamBasics;
import java.util.Scanner;
public class P04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int i=1;
        double sumOfAlcoholLiters=0;
        double sumOfDegrees=0;
        while (i<=n){
            double alcoholLiters=Double.parseDouble(scanner.nextLine());
            double degreesOfDay=Double.parseDouble(scanner.nextLine());

            sumOfAlcoholLiters+=alcoholLiters;
            sumOfDegrees+=(degreesOfDay*alcoholLiters);
            i++;
        }

        double averageDegrees=sumOfDegrees/sumOfAlcoholLiters;

        System.out.printf("Liter: %.2f%n",sumOfAlcoholLiters);
        System.out.printf("Degrees: %.2f%n", averageDegrees);

        if(averageDegrees<38){
            System.out.printf("Not good, you should baking!");
        }
        else if(averageDegrees>=38 && averageDegrees<=42){
            System.out.printf("Super!");
        }
        else if(averageDegrees>42){
            System.out.printf("Dilution with distilled water!");
        }

    }
}
