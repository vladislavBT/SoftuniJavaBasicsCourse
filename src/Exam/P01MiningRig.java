package Exam;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class P01MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceVideoCard=Integer.parseInt(scanner.nextLine());
        int priceAdapter=Integer.parseInt(scanner.nextLine());
        double consumedElectricity= Double.parseDouble(scanner.nextLine());
        double earningsOfOneVideoCard=Double.parseDouble(scanner.nextLine());

        int sumWasted=(priceVideoCard*13)+(priceAdapter*13)+1000;
        double earningsADay=(earningsOfOneVideoCard-consumedElectricity)*13;

        System.out.println(sumWasted);
        System.out.printf("%.0f",Math.ceil(sumWasted/earningsADay));

    }
}
