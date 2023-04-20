package Exam;
import java.util.Scanner;
public class P05ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command= scanner.nextLine();
        int kids=0;
        int adults=0;

        while(!(command.equals("Christmas"))){
            int age=Integer.parseInt(command);

            if(age<=16){
                kids++;
            }
            else{
                adults++;
            }

            command= scanner.nextLine();
        }

        int moneyForKids=kids*5;
        int moneyForAdults=adults*15;

        System.out.printf("Number of adults: %d%n",adults);
        System.out.printf("Number of kids: %d%n",kids);
        System.out.printf("Money for toys: %d%n",moneyForKids);
        System.out.printf("Money for sweaters: %d%n",moneyForAdults);

    }
}
