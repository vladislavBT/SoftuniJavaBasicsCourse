package WhileLoop2;
import java.util.Scanner;
public class p07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight= Integer.parseInt(scanner.nextLine());
        int height=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        String boxes=scanner.nextLine();
        int volume=weight*height*length;

        while(!(boxes.equals("Done"))){

                int numBox=Integer.parseInt(boxes);
                volume=volume-numBox;
                if(volume<0){
                    int positiveVolume=-volume;
                    System.out.printf("No more free space! You need %d Cubic meters more.", positiveVolume);
                    break;
                }

                boxes=scanner.nextLine();
            }
               if(boxes.equals("Done")) {
                   System.out.printf("%d Cubic meters left.", volume);
               }




        }

    }

