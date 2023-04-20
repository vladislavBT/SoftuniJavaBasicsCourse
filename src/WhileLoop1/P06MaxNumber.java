package WhileLoop1;
import  java.util.Scanner;
public class P06MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int max=Integer.MIN_VALUE;

        while (!(n.equals("Stop"))){
            int currentNum=Integer.parseInt(n);
            if(currentNum>max){
                max=currentNum;
            }
          n= scanner.nextLine();
        }

        System.out.println(max);
    }
}
