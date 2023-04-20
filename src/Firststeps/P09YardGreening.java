package Firststeps;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {

        //The final price is: 936.03 lv.
        //
        //The discount is: 205.47 lv.
        Scanner scanner = new Scanner(System.in);

        double house= Double.parseDouble(scanner.nextLine());
        double generalPrice= house * 7.61;
        double finalPrice= (generalPrice *82)/100;
        double discount = (generalPrice*18)/100;



        System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", discount);



    }
}
