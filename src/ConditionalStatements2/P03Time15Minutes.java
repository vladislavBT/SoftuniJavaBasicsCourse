package ConditionalStatements2;
import java.util.Scanner;
public class P03Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if(b>=45){
            int c=15-(60-b);
              if(c<10){

                  if(a==23){
                      System.out.println("0:0"+c);
                  }
                  else{
                      System.out.println(a+1+":0"+c);
                  }
              }
              else{
                  if(a==23){
                      System.out.println("0:"+c);
                  }
                  else{
                      System.out.println(a+1+":"+c);
                  }
              }
        }

        else{

            System.out.println(a+":"+(b+15));

        }
    }
}
