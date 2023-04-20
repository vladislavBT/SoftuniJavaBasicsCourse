package ConditionalStatementsAdvanced2;

import java.util.Scanner;
public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());



        String time= scanner.nextLine();

        if(time.equals("Morning")){
            if(degrees>=10 && degrees<=18){
               String outfit ="Sweatshirt";
               String shoes="Sneakers";
                System.out.printf("It's %d degrees, get your %s and %s.",degrees , outfit, shoes);
            }
            else if(degrees>=18 && degrees<=24){
                String outfit ="Shirt";
                String shoes="Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.",degrees , outfit, shoes);
            }
            else if(degrees>=26){
                String outfit ="T-Shirt";
                String shoes="Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.",degrees , outfit, shoes);
            }
        }
        else if(time.equals("Afternoon")) {
            if (degrees >= 10 && degrees <= 18) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 18 && degrees <= 24) {
                String outfit = "T-Shirt";
                String shoes = "Sandals";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 26) {
                String outfit = "Swim Suit";
                String shoes = "Barefoot";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        }
        else if(time.equals("Evening")) {
            if (degrees >= 10 && degrees <= 18) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 18 && degrees <= 24) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            } else if (degrees >= 26) {
                String outfit = "Shirt";
                String shoes = "Moccasins";
                System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
            }
        }

    }
}
