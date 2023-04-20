package WhileLoop1;
import java.util.Scanner;
public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int min=Integer.MAX_VALUE;

        while (!(n.equals("Stop"))){
            int currentNum=Integer.parseInt(n);
            if(currentNum<min){
                min=currentNum;
            }
            n= scanner.nextLine();
        }

        System.out.println(min);
    }
}
