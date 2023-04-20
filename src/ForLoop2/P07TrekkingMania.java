package ForLoop2;
import java.util.Scanner;
public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char character='%';
        int n =Integer.parseInt(scanner.next());
        int p1=0,p2=0,p3=0,p4=0,p5=0;
        double everybody=0;

        for (int i = 0; i < n; i++) {
            int peopleInGroup=Integer.parseInt(scanner.next());
            everybody+=peopleInGroup;
            if(peopleInGroup<=5){
                p1+=peopleInGroup;
            }
            else if(peopleInGroup>=6 && peopleInGroup<=12){
                p2+=peopleInGroup;
            }
            else if(peopleInGroup>=13 && peopleInGroup<=25){
                p3+=peopleInGroup;
            }
            else if(peopleInGroup>=26 && peopleInGroup<=40){
                p4+=peopleInGroup;
            }
            else if(peopleInGroup>=41){
                p5+=peopleInGroup;
            }


        }

        System.out.printf("%.2f%c%n", (p1/everybody)*100, character);
        System.out.printf("%.2f%c%n", (p2/everybody)*100, character);
        System.out.printf("%.2f%c%n", (p3/everybody)*100, character);
        System.out.printf("%.2f%c%n", (p4/everybody)*100, character);
        System.out.printf("%.2f%c%n", (p5/everybody)*100, character);
    }
}
