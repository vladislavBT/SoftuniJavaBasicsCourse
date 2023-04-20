package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1= Integer.parseInt(scanner.nextLine());
        int N2=Integer.parseInt(scanner.nextLine());
        int result = 0;
        double result1=0;


        String symbol = scanner.nextLine();

        if(symbol.equals("+")){
            result=N1+N2;
            if(result%2==0){

                System.out.printf("%d %s %d = %d - even" ,N1 ,symbol, N2, result);
            }
            else{
                System.out.printf("%d %s %d = %d - odd" ,N1 ,symbol, N2, result);

            }
        }
        else if(symbol.equals("-")){
            result=N1-N2;
            if(result%2==0){

                System.out.printf("%d %s %d = %d - even" ,N1 ,symbol, N2, result);
            }
            else{
                System.out.printf("%d %s %d = %d - odd" ,N1 ,symbol, N2, result);

            }
        }
        else if(symbol.equals("*")){
            result=N1*N2;
            if(result%2==0){

                System.out.printf("%d %s %d = %d - even" ,N1 ,symbol, N2, result);
            }
            else{
                System.out.printf("%d %s %d = %d - odd" ,N1 ,symbol, N2, result);

            }
        }
        else if(symbol.equals("/")){

            if(!(N2==0)){
                result1=N1/N2;
                System.out.printf("%d %s %d = %d" ,N1 ,symbol, N2, result1);
            }
            else{
                System.out.printf("Cannot divide %d by zero" ,N1);

            }
        }
        else if(symbol.equals("%")){

            if(!(N2==0)){
                result=N1%N2;
                System.out.printf("%d %s %d = %d" ,N1 ,symbol, N2, result);
            }
            else{
                System.out.printf("Cannot divide %d by zero" ,N1);

            }
        }

    }
}
