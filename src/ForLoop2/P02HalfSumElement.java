package ForLoop2;
import java.util.Scanner;
public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum=0;
        int max=Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            int num =Integer.parseInt(scanner.nextLine());
            sum+=num;
            if(num>max){
                max=num;
            }

        }
        if(sum-max==max){
            System.out.printf("Yes%nSum = %d%n", max);
        }
        else{
            System.out.printf("No%nDiff = %d%n", Math.abs(max-(sum-max)));
        }
    }
}
