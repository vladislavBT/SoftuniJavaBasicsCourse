package WhileLoop2;
import java.util.Scanner;
public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumSteps=0;

        while(sumSteps<10000){
            String steps= scanner.nextLine();
            if(steps.equals("Going home")){
                int stepsNum = Integer.parseInt(scanner.nextLine());
                sumSteps+= stepsNum;
              break;
            }
            else {
               int stepsNum = Integer.parseInt(steps);
                sumSteps+= stepsNum;

            }

        }
        if(sumSteps>=10000) {
            int difference = sumSteps - 10000;
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", difference);
        }
        else{
            int difference=10000-sumSteps;
            System.out.printf("%d more steps to reach goal.",difference);
        }
    }
}
