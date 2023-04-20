package PreExamBasics;
import java.util.Scanner;
public class PPCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessor=Double.parseDouble(scanner.nextLine());
        double priceVideoCard=Double.parseDouble(scanner.nextLine());
        double priceRAM=Double.parseDouble(scanner.nextLine());
        int numRAM=Integer.parseInt(scanner.nextLine());
        double discount=Double.parseDouble(scanner.nextLine());

        double priceProcessor2=(priceProcessor*1.57)*(1-discount);
        double priceVideoCard2=(priceVideoCard*1.57)*(1-discount);
        double priceRAM2=(priceRAM*numRAM*1.57);

        double sum=priceProcessor2+priceVideoCard2+priceRAM2;

        System.out.printf("Money needed - %.2f leva.",sum);




    }
}
