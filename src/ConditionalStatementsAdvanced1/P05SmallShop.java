package ConditionalStatementsAdvanced1;
import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town= scanner.nextLine();
        double times = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if(town.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = 0.50;
                double priceTotal = price * times;
                System.out.println(priceTotal);
            } else if (product.equals("water")) {
                price = 0.80;
                double priceTotal = price * times;
                System.out.println(priceTotal);
            } else if (product.equals("beer")) {
                price = 1.20;
                double priceTotal = price * times;
                System.out.println(priceTotal);
            } else if (product.equals("sweets")) {
                price = 1.45;
                double priceTotal = price * times;
                System.out.println(priceTotal);
            } else if (product.equals("peanuts")) {
                price = 1.60;
                double priceTotal = price * times;
                System.out.println(priceTotal);
            }
        }
        else if(town.equals("Plovdiv")){
            if(product.equals("coffee")){
                price = 0.40;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("water")){
                price = 0.70;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("beer")){
                price = 1.15;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("sweets")){
                price = 1.30;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("peanuts")){
                price = 1.50;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
        }
        else if(town.equals("Varna")){
            if(product.equals("coffee")){
                price = 0.45;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("water")){
                price = 0.70;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("beer")){
                price = 1.10;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("sweets")){
                price = 1.35;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
            else if(product.equals("peanuts")){
                price = 1.55;
                double priceTotal= price* times;
                System.out.println(priceTotal);
            }
        }
    }
}
