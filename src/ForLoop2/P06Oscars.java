package ForLoop2;
import java.util.Scanner;
public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor= scanner.nextLine();
        double pointsAcademy=Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String nameJudge= scanner.nextLine();
            double pointsJudge=Double.parseDouble(scanner.nextLine());

            pointsAcademy+=((nameJudge.length())*pointsJudge)/2;
            if(pointsAcademy>1250.5){

                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, pointsAcademy);
                break;
            }
        }

        if(pointsAcademy<=1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",nameActor,1250.5-pointsAcademy);

        }


    }
}
