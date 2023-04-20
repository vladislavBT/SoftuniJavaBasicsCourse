package ForLoop1;
import java.util.Scanner;
public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNum =Integer.parseInt(scanner.nextLine());
            if(currentNum>max){
                max=currentNum;
            }
            if(currentNum<min){
                min=currentNum;
            }

        }
        System.out.printf("Max number: %d%n",max);
        System.out.printf("Min number: %d%n",min);

    }
}
