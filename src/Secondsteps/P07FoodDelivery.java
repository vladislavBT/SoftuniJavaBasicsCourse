package Secondsteps;

import java.util.Scanner;

public class P07FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        int chicken= Integer.parseInt(scanner.nextLine());
        int fish= Integer.parseInt(scanner.nextLine());
        int vegetables= Integer.parseInt(scanner.nextLine());

        double sum= (chicken*10.35 + fish*12.40 + vegetables*8.15)*120/100;
                double mainSum=sum+2.50;
        System.out.println(mainSum);

    }
}
