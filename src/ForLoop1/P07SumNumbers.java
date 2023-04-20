package ForLoop1;
import java.util.Scanner;
public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = 0; i < n; i++) {
            int p =Integer.parseInt(scanner.nextLine());
            sum+=p;

        }
        System.out.println(sum);



    }
}
