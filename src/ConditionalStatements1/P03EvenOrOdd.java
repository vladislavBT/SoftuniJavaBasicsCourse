package ConditionalStatements1;
import java.util.Scanner;
public class P03EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a=Integer.parseInt(scanner.nextLine());

        if(a%2==0){
            System.out.println("even");
        }

        else {
            System.out.println("odd");
        }
    }
}
