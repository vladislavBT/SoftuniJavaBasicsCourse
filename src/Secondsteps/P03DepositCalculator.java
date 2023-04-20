package Secondsteps;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

           double depositSum= Double.parseDouble(scanner.nextLine());
           int months= Integer.parseInt(scanner.nextLine());
           double yearInterest= Double.parseDouble(scanner.nextLine());

           double sum= depositSum + months*((depositSum*yearInterest/100)/12);
        System.out.println(sum);


    }

}
