package ConditionalStatements2;
import java.util.Scanner;
public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord=Double.parseDouble(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        double oneMeterSwim=Double.parseDouble(scanner.nextLine());
        int ivanFirstly=length/15;
        double ivanSecondly = ivanFirstly*12.5;
        double ivanTime=(length*oneMeterSwim + ivanSecondly);

        if(worldRecord>ivanTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        }
        else{
            double ivanTimeFloat=Math.floor(length*oneMeterSwim+(length/15)*12.5);
            double neededTime=ivanTimeFloat-worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededTime);

        }
    }
}
