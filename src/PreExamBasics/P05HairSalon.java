package PreExamBasics;
import java.util.Scanner;
public class P05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal= Integer.parseInt(scanner.nextLine());
        String service = scanner.nextLine();
        int earnings=0;

        while (!(service.equals("closed"))){
            String kindOfService=scanner.nextLine();
            if(earnings>=goal){
                System.out.printf("You have reached your target for the day!%n");
                System.out.printf("Earned money: %dlv.", earnings);
            }

            if(service.equals("haircut")&& kindOfService.equals("mens")){
                earnings+=15;
            }
            else if(service.equals("haircut")&& kindOfService.equals("ladies")){
                earnings+=20;
            }
            else if(service.equals("haircut")&& kindOfService.equals("kids")){
                earnings+=10;
            }
            else if(service.equals("color")&& kindOfService.equals("touch up")){
                earnings+=20;
            }
            else if(service.equals("color")&& kindOfService.equals("full color")){
                earnings+=30;
            }


            service=scanner.nextLine();
        }

        if(service.equals("closed")){
            int neededMoney=goal-earnings;
            System.out.printf("Target not reached! You need %dlv. more.%n",neededMoney);
            System.out.printf("Earned money: %dlv.", earnings);
        }

    }
}
