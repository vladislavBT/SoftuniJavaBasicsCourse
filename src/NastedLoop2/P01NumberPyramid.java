package NastedLoop2;
import java.util.Scanner;
public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int current=1;
        boolean isBigger=false;

        for(int rows=1; rows<=n; rows++){


            for(int cols=1; cols<=rows; cols++){
                if(current>n){
                    isBigger=true;
                    break;
                }
                System.out.printf("%d ",current);
                current++;
            }
            System.out.println();
            if(isBigger==true){
                break;
            }
        }

    }
}
