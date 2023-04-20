package NestedLoop1;
import java.util.Scanner;
public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int magicNum=Integer.parseInt(scanner.nextLine());
        int counter=0;
        boolean isValid=false;

        for (int i = firstNum; i <=secondNum ; i++) {
            for (int j = firstNum; j <=secondNum ; j++) {
                counter++;
                if(i+j==magicNum){
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,magicNum);
                    break;
                }
            }
            if(isValid==true){
                break;
            }
        }

        if(isValid==false){
            System.out.printf("%d combinations - neither equals %d",counter,magicNum);
        }

        }


}
