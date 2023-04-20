package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month= scanner.nextLine();
        int nights= Integer.parseInt(scanner.nextLine());
        double nightPriceA=0;
        double nightPriceS=0;
        double sumA=0;
        double sumS=0;


        if(month.equals("May") || month.equals("October")){
            nightPriceA=65;
            sumA= nightPriceA*nights;
            if(nights>14){
                sumA=0.90*sumA;
                System.out.printf("Apartment: %.2f lv.%n", sumA);
            }
            else{


                System.out.printf("Apartment: %.2f lv.%n", sumA);
            }

            nightPriceS=50;
            sumS = nightPriceS*nights;
            if(nights>7 && nights<=14){
                sumS=sumS*0.95;
                System.out.printf("Studio: %.2f lv.", sumS);

            }
            else if(nights>14){
                sumS=sumS*0.70;
                System.out.printf("Studio: %.2f lv.", sumS);
            }
            else{
                System.out.printf("Studio: %.2f lv.", sumS);
            }


        }

        if(month.equals("June") || month.equals("September")){
            nightPriceA=68.70;
            sumA= nightPriceA*nights;
            if(nights>14){
                sumA=0.90*sumA;
                System.out.printf("Apartment: %.2f lv.%n", sumA);
            }
            else{


                System.out.printf("Apartment: %.2f lv.%n", sumA);
            }
            nightPriceS=75.20;
            sumS = nightPriceS*nights;

            if(nights>14){
                sumS=sumS*0.80;
                System.out.printf("Studio: %.2f lv.", sumS);
            }
            else{
                System.out.printf("Studio: %.2f lv.", sumS);
            }

        }

        if(month.equals("July") || month.equals("August")){
            nightPriceA=77;
            sumA= nightPriceA*nights;
            if(nights>14){
                sumA=0.90*sumA;
                System.out.printf("Apartment: %.2f lv.%n", sumA);
            }
            else{
                System.out.printf("Apartment: %.2f lv.%n", sumA);
            }
            nightPriceS=76;
            sumS = nightPriceS*nights;

            System.out.printf("Studio: %.2f lv.", sumS);
        }

    }
}
