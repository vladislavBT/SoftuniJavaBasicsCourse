package ForLoop2;
import java.util.Scanner;
public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double laundry=Double.parseDouble(scanner.nextLine());
        int toy=Integer.parseInt(scanner.nextLine());
        int moneyBirthday=0;
        int sum=0;
        int counter=0;
        int counterToy=0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                counter+=1;
                moneyBirthday+=10;
              sum+=moneyBirthday;

            }
            if(i%2==1){
                counterToy+=1;

            }
        }

        boolean isValid= ((counterToy*toy)+ sum-counter)>=laundry;

        if(isValid==true){
            System.out.printf("Yes! %.2f%n", ((counterToy*toy)+ sum-counter)-laundry);

        }
        else {
            System.out.printf("No! %.2f%n", laundry-((counterToy*toy)+ sum-counter));
        }
    }
}
