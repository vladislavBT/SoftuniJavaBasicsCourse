package ConditionalStatementsAdvanced1;
import java.util.Scanner;
public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour= Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        boolean isWorking = hour>=10 && hour<=18;
        boolean isWorkingTwo = day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||day.equals("Thursday")|| day.equals("Friday") || day.equals("Saturday");

        if(isWorking){
            if(isWorkingTwo){
                System.out.println("open");
            }
            else {
                System.out.println("closed");
            }
        }
        else {
            System.out.println("closed");
        }
    }
}
