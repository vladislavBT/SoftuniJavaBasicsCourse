package NastedLoop2;
import java.util.Scanner;
public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n=scanner.nextLine();
        int sumPrime=0;
        int sumNotPrime=0;
        int counter=0;
        while(!(n.equals("stop"))){
            int num=Integer.parseInt(n);
            counter=0;
            if(num<0){
                System.out.println("Number is negative.");
                n=scanner.nextLine();
                continue;
            }
            else if(num==0){
                sumNotPrime+=num;
                n=scanner.nextLine();
                continue;
            }
            else if(num==1){
                sumNotPrime+=num;
                n=scanner.nextLine();
                continue;
            }
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    sumNotPrime+=num;
                    break;
                }
                else {
                    counter++;
                    continue;
                }

            }
            if(counter==num-2){
                sumPrime+=num;
                counter=0;
            }
            n=scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNotPrime);
    }
}
