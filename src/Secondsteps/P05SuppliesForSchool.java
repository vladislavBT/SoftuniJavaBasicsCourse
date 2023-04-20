package Secondsteps;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int numberOfPencils= Integer.parseInt(scanner.nextLine());
        int numberOfMarkers= Integer.parseInt(scanner.nextLine());
        int liters= Integer.parseInt(scanner.nextLine());
        int discount= Integer.parseInt(scanner.nextLine());

        double sum= (numberOfPencils * 5.80 + numberOfMarkers * 7.20 + liters * 1.20) * (100-discount)/100;

        System.out.println(sum);
    }
}

