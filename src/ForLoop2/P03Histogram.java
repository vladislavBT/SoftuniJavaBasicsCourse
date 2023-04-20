package ForLoop2;
import java.util.Scanner;
public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1=0,p2=0,p3=0,p4=0,p5=0;
        char percentage='%';
        for (int i = 0; i < n; i++) {
            int num=Integer.parseInt(scanner.nextLine());

            if(num<200){
                p1+=1;
            }
            else if(num>=200 && num<=399){
                p2+=1;

            }
            else if(num>=400 && num<=599){
                p3+=1;
            }
            else if(num>=600&& num<=799){
                p4+=1;
            }
            else if(num>=800){
                p5+=1;
            }
        }

        System.out.printf("%.2f%s%n", ((p1/n)*100),percentage);
        System.out.printf("%.2f%s%n", ((p2/n)*100),percentage );
        System.out.printf("%.2f%s%n", ((p3/n)*100),percentage );
        System.out.printf("%.2f%s%n", ((p4/n)*100),percentage );
        System.out.printf("%.2f%s%n", ((p5/n)*100),percentage );

    }
}
