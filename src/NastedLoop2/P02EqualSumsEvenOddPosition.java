package NastedLoop2;
import java.util.Scanner;
public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());


        for (int i = firstNum; i <=secondNum ; i++) {
            String currentNum= "" + i;
            int sumOddPositions=0;
            int sumEvenPositions=0;
            for (int j = 0; j <=5 ; j++) {
                if(j%2==0){
                    int currentDigit=Integer.parseInt("" + currentNum.charAt(j));
                    sumOddPositions+=currentDigit;
                }
                if(j%2==1){
                    int currentDigit=Integer.parseInt("" + currentNum.charAt(j));
                    sumEvenPositions+=currentDigit;
                }

            }
            if(sumOddPositions==sumEvenPositions){
                System.out.printf("%d ",i);
            }
        }
    }
}
