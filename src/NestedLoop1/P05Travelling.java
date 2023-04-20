package NestedLoop1;
import java.util.Scanner;
public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country= scanner.nextLine();


        while((!country.equals("End"))) {
            double budget=Double.parseDouble(scanner.nextLine());
            double n=0;
            while(n<budget){
                double savings=Double.parseDouble(scanner.nextLine());
                n+=savings;
            }
            System.out.printf("Going to %s!%n",country);
            country=scanner.nextLine();
        }
    }
}
