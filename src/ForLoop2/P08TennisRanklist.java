package ForLoop2;
import java.util.Scanner;
public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol='%';
        int n=Integer.parseInt(scanner.nextLine());
        int startPoints=Integer.parseInt(scanner.nextLine());
        int p1=0,p2=0,p3=0;

        for (int i = 0; i < n; i++) {
            String tournament= scanner.nextLine();
            if(tournament.equals("W")){
                p1+=1;

            }
            else if(tournament.equals("SF")){
                p2+=1;

            }
            else if(tournament.equals("F")){
                p3+=1;

            }
        }

        int allPoints=startPoints+p1*2000+p2*720+p3*1200;
        int averagePoints=(p1*2000+p2*720+p3*1200)/n;
        double percentWins= p1*100;
        double percentWinsOne=percentWins/n;

        System.out.printf("Final points: %d%n", allPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%c%n",percentWinsOne,symbol);
    }
}
