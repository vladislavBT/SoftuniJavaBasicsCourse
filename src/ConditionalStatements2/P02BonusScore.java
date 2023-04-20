package ConditionalStatements2;
import java.util.Scanner;
public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());

        if(a<=100){
           double bonus = 5;
              if(a%2==0){
                  bonus +=1;
              }
              if(a%10==5){
                  bonus +=2;
              }
            System.out.println(bonus);
            System.out.println(bonus+a);
        }

        else if(a>100 && a<=1000){
            double bonus = a * 0.2;
            if(a%2==0){
                bonus +=1;
            }
            if(a%10==5){
                bonus +=2;
            }
            System.out.println(bonus);
            System.out.println(bonus+a);
        }

        else if(a>1000){
            double bonus = a * 0.1;
            if(a%2==0){
                bonus +=1;
            }
            if(a%10==5){
                bonus +=2;
            }
            System.out.println(bonus);
            System.out.println(bonus+a);
        }


    }
}
