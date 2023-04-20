package WhileLoop1;
import java.util.Scanner;
public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        double sum=0;

        while(!(n.equals("NoMoreMoney"))){
           double currentAmount = Double.parseDouble(n);

           if(currentAmount<0){
               System.out.println("Invalid operation!");
               break;
           }
           sum+= currentAmount;
            System.out.printf("Increase: %.2f%n", currentAmount);

            n=scanner.nextLine();

        }
        System.out.printf("Total: %.2f", sum);


    }
}
