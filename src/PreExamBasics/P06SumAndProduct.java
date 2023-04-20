package PreExamBasics;
import java.util.Scanner;
public class P06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isValid=false;

        for (int a = 1; a <=9 ; a++) {
            if(isValid==true){break;}
            for (int b = 9; b >=a ; b--) {
                if(isValid==true){break;}
                for (int c = 0; c <=9 ; c++) {
                    if(isValid==true){break;}
                    for (int d = 9; d >=c ; d--) {
                        if(((a+b+c+d)==(a*b*c*d))&& (n%10==5)){
                            isValid=true;
                            System.out.printf("%d%d%d%d",a,b,c,d);
                            break;
                        }
                        if(((a*b*c*d)/(a+b+c+d)==3) && (n%3==0)){
                            isValid=true;
                            System.out.printf("%d%d%d%d",d,c,b,a);
                            break;
                        }
                    }
                }
            }
        }
        if(isValid==false){
            System.out.println("Nothing found");
        }

    }
}
