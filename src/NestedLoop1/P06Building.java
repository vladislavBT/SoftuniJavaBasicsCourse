package NestedLoop1;
import java.util.Scanner;
public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFloors=Integer.parseInt(scanner.nextLine());
        int numRooms=Integer.parseInt(scanner.nextLine());

        for (int i = numFloors; i >=1 ; i--) {
            System.out.printf("%n");
            for (int j = 0; j <numRooms ; j++) {
                if(i==numFloors){
                    System.out.printf("L%d%d ",i,j);
                }
                else if(i%2==1){
                    System.out.printf("A%d%d ",i,j);
                }
                else if(i%2==0){
                    System.out.printf("O%d%d ",i,j);
                }

            }

        }
        
        
    }
}
