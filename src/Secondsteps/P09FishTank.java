package Secondsteps;

import java.util.Scanner;

public class P09FishTank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double duljina= (Double.parseDouble(scanner.nextLine()))/10;
        double shirina= (Double.parseDouble(scanner.nextLine()))/10;
        double visochina= (Double.parseDouble(scanner.nextLine()))/10;

        double procent= (Double.parseDouble(scanner.nextLine()));

        double obem= duljina * shirina *visochina;

        double sum= obem * (100-procent)/100;

        System.out.println(sum);
    }
}
