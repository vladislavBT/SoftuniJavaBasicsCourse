package WhileLoop1;
import  java.util.Scanner;
public class P04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNum=1;
        while (n>=currentNum){
            System.out.println(currentNum);
            currentNum=2*currentNum+1;
        }
    }
}
