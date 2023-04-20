package ForLoop1;
import java.util.Scanner;
public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i < n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            if(i%2==0){
                sumOdd=sumOdd+currentNum;
            }
            else if(i%2==1){
                sumEven=sumEven+currentNum;
            }

        }
        if(sumOdd==sumEven){
            System.out.printf("Yes%nSum = %d%n", sumOdd);
        }
        else{
            System.out.printf("No%nDiff = %d%n", Math.abs(sumOdd-sumEven));

        }

    }
}
