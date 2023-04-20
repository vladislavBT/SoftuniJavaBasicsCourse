package ConditionalStatements2.P08;
import java.util.Scanner;
public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        int episode= Integer.parseInt(scanner.nextLine());
        int rest=Integer.parseInt(scanner.nextLine());
        double one=1;
        double timeForLunch=rest * (one/8);
        double timeForBreath=rest * (one/4);

        double time= rest-(timeForBreath+timeForLunch);

        if(episode<=time){
            double leftTime= time-episode;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name,leftTime);
        }
        else{
            double neededTime=episode-time;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, neededTime );
        }

    }
}
