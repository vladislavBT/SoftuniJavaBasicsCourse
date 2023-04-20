package WhileLoop2;
import java.util.Scanner;
public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length=Integer.parseInt(scanner.nextLine());
        int weight=Integer.parseInt(scanner.nextLine());
        int area=length*weight;

        int counter=0;

        while(area>0){
           String kube=scanner.nextLine();
            if(kube.equals("STOP")){
                System.out.printf("%d pieces are left.", area);
                break;
            }
            else {
               int kubeNum = Integer.parseInt(kube);
               area-=kubeNum;
            }

        }
        if(area<=0){
            int difference=-area;
            System.out.printf("No more cake left! You need %d pieces more.",difference);
        }


    }
}
