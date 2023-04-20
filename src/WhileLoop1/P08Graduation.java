package WhileLoop1;
import java.util.Scanner;
public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int y=1;
        double averageMarks=0;
        int counter=0;
        double mark=0;
        while(y<=12){

            if(counter>1){
                break;
            }
            mark=Double.parseDouble(scanner.nextLine());
            if(mark<4){
                counter++;
                continue;
            }

            averageMarks+=mark;
          y++;

        }
        if(counter>1){
            System.out.printf("%s has been excluded at %d grade", name, y);
        }
        else{
        System.out.printf("%s graduated. Average grade: %.2f", name, averageMarks/12);
    }
    }
}
