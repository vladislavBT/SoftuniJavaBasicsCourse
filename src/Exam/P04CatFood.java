package Exam;
import java.util.Scanner;
public class P04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCats=Integer.parseInt(scanner.nextLine());
        int groupOne=0;
        int groupTwo=0;
        int groupThree=0;
        double sumOfFood=0;


        while(numCats>0){
            numCats--;
            double food=Double.parseDouble(scanner.nextLine());

            sumOfFood+=food;
            if(food>=100 && food<200){
                groupOne++;
            }
            else if(food>=200 && food<300){
                groupTwo++;
            }
            else if(food>=300 && food<400){
                groupThree++;
            }
        }

        System.out.printf("Group 1: %d cats.%n",groupOne);
        System.out.printf("Group 2: %d cats.%n",groupTwo);
        System.out.printf("Group 3: %d cats.%n",groupThree);

        double kgFood=sumOfFood/1000;

        System.out.printf("Price for food per day: %.2f lv.",kgFood*12.45);
    }
}
