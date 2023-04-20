package Secondsteps;

import java.util.Scanner;

public class P06Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nailon= Integer.parseInt(scanner.nextLine()) + 2;
        double paint= (Double.parseDouble(scanner.nextLine()))*110/100;
        int razpredelitel= Integer.parseInt(scanner.nextLine());
        int hours= Integer.parseInt(scanner.nextLine());
        double pouch= 0.40;

        double sum= nailon * 1.50 + paint * 14.50 + razpredelitel * 5.00 + pouch;
        double mainsum= ((sum*30/100) * hours) + sum;

        System.out.println(mainsum);



    }
}
