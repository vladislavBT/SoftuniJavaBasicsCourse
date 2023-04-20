package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinema= scanner.nextLine();

        int r= Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price=0;
        double sum=0;

        if(cinema.equals("Premiere")){
            price = 12.00;
            sum= price*(c*r);

            System.out.printf("%.2f leva", sum);
        }
        else if(cinema.equals("Normal")){
            price = 7.50;
            sum= price*(c*r);

            System.out.printf("%.2f leva", sum);
        }
        else if(cinema.equals("Discount")){
            price = 5.00;
            sum= price*(c*r);

            System.out.printf("%.2f leva", sum);
        }

    }
}
