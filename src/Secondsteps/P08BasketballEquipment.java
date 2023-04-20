package Secondsteps;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yearPay= Integer.parseInt(scanner.nextLine());

        double kecove = (yearPay * 60) /100;
        double kit= (kecove * 80) / 100;
        double topka= kit/4;
        double accessory= topka/5;

        double sum= yearPay+kecove+kit+topka+accessory;

        System.out.println(sum);

    }
}
