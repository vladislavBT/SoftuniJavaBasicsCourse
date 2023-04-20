package ConditionalStatementsAdvanced1;
import  java.util.Scanner;
public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();;
        String day = scanner.nextLine();
        double times= Double.parseDouble(scanner.nextLine());
        double price=0;

        boolean workingDays= day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||day.equals("Thursday")|| day.equals("Friday");
        boolean weekEnd= day.equals("Saturday") || day.equals("Sunday");

          if(workingDays){
              if(fruit.equals("banana")){
                  price= 2.50;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);

              }
              else if(fruit.equals("apple")){
                  price = 1.20;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("orange")){
                  price = 0.85;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("grapefruit")){
                  price=1.45;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("kiwi")){
                  price=2.70;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("pineapple")){
                  price = 5.50;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("grapes")){
                  price = 3.85;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else {
                  System.out.println("error");
              }
          }
          else if(weekEnd){
              if(fruit.equals("banana")){
                  price= 2.70;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("apple")){
                  price = 1.25;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("orange")){
                  price = 0.90;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("grapefruit")){
                  price=1.60;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);;
              }
              else if(fruit.equals("kiwi")){
                  price=3.00;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("pineapple")){
                  price = 5.60;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else if(fruit.equals("grapes")){
                  price = 4.20;
                  double priceTwo=price*times;
                  System.out.printf("%.2f", priceTwo);
              }
              else {
                  System.out.println("error");
              }
          }
          else {
              System.out.println("error");
          }



    }
}
