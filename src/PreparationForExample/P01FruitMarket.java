package PreparationForExample;
import java.util.Scanner;
public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceStrawberry=Double.parseDouble(scanner.nextLine());
        double kgBanana=Double.parseDouble(scanner.nextLine());
        double kgOrange=Double.parseDouble(scanner.nextLine());
        double kgRaspberries=Double.parseDouble(scanner.nextLine());
        double kgStrawberry=Double.parseDouble(scanner.nextLine());

        double priceRaspberries=priceStrawberry/2;
        double priceOrange=0.60*priceRaspberries;
        double priceBanana=0.20*priceRaspberries;

        double sum=priceBanana*kgBanana+priceOrange*kgOrange+priceStrawberry*kgStrawberry+priceRaspberries*kgRaspberries;

        System.out.printf("%.2f",sum);

    }
}
