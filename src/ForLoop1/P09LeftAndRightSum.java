package ForLoop1;
import java.util.Scanner;
public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        int leftSum=0;
        int rightSum=0;

        for (int i = 0; i < n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            leftSum=leftSum+currentNum;


        }

        for (int i = 0; i < n; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            rightSum=rightSum+currentNum;


        }

        if(rightSum==leftSum){
            System.out.printf("Yes, sum = %d%n", leftSum);
        }
        else{
            System.out.printf("No, diff = %d%n", Math.abs(leftSum-rightSum));
        }
    }
}
