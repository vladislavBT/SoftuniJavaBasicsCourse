package Firststeps;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int foodDogs= Integer.parseInt(scanner.nextLine());
        int foodCats= Integer.parseInt(scanner.nextLine());

        double Dogs= foodDogs * 2.5;
        double Cats= foodCats * 4;

        double sum= Cats + Dogs;

        System.out.println(sum + " lv.");
    }
}
