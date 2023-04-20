package PreparationForExample;
import java.util.Scanner;
public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eatenFood=0;
        String symbol="%";
        int sumFoodEatenByDog=0;
        int sumFoodEatenByCat=0;
        double biscuits=0;

        int days=Integer.parseInt(scanner.nextLine());
        double availableFood=Double.parseDouble(scanner.nextLine());
        int counter=1;
        while(counter<=days){
            int foodEatenByDog=Integer.parseInt(scanner.nextLine());
            int foodEatenByCat=Integer.parseInt(scanner.nextLine());

            eatenFood = eatenFood +(foodEatenByCat+foodEatenByDog);
            sumFoodEatenByDog+=foodEatenByDog;
            sumFoodEatenByCat+=foodEatenByCat;
            if(counter%3==0){
                biscuits=biscuits+(0.1*foodEatenByCat+0.1*foodEatenByDog);
            }
            counter++;
        }

        double secondOutput=(eatenFood/availableFood)*100;
        double thirdOutput=(sumFoodEatenByDog/eatenFood)*100;
        double fourthOutput=(sumFoodEatenByCat/eatenFood)*100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%s of the food has been eaten.%n", secondOutput,symbol);
        System.out.printf("%.2f%s eaten from the dog.%n",thirdOutput,symbol);
        System.out.printf("%.2f%s eaten from the cat.",fourthOutput,symbol);
    }
}
