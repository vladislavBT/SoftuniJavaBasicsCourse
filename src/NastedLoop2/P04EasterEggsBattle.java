package NastedLoop2;
import java.util.Scanner;
public class P04EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEggsOne=Integer.parseInt(scanner.nextLine());
        int numEggsTwo=Integer.parseInt(scanner.nextLine());
        String command= scanner.nextLine();

        while(!(command.equals("End of battle"))){
            if(command.equals("one")){
                numEggsTwo-=1;
            }
            if(command.equals("two")){
                numEggsOne-=1;
            }
            if(numEggsOne==0 || numEggsTwo==0){
                if(numEggsOne==0){
                    System.out.printf("Player one is out of eggs. Player two has %d eggs left.",numEggsTwo);
                    break;
                }
                if(numEggsTwo==0){
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.",numEggsOne);
                    break;
                }
            }
            command= scanner.nextLine();

        }

        if(command.equals("End of battle")){
            System.out.printf("Player one has %d eggs left.%n",numEggsOne);
            System.out.printf("Player two has %d eggs left.",numEggsTwo);
        }
    }
}
