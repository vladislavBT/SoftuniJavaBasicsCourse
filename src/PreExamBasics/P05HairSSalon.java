package PreExamBasics;
import java.util.Scanner;
public class P05HairSSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal= Integer.parseInt(scanner.nextLine());
        String service = scanner.nextLine();
        int earnings=0;

        while (!(service.equals("closed"))){

            if(service.equals("haircut")){
                service= scanner.nextLine();
                if(service.equals("mens")){
                    earnings+=15;

                }
                if(service.equals("ladies")){
                    earnings+=20;

                }
                if(service.equals("kids")){
                    earnings+=10;

                }}
            if(service.equals("color")){
                service=scanner.nextLine();
                if(service.equals("touch up")){
                    earnings+=20;

                }
                if(service.equals("full color")){
                    earnings+=30;

                }
            }

            if(goal>earnings){
                service=scanner.nextLine();
            }
            else{
                System.out.printf("You have reached your target for the day!%n");
                System.out.printf("Earned money: %dlv.", earnings);
                break;
            }

            }
        if(service.equals("closed")){
            int neededMoney=goal-earnings;
            System.out.printf("Target not reached! You need %dlv. more.%n",neededMoney);
            System.out.printf("Earned money: %dlv.", earnings);
        }

        }
    }

