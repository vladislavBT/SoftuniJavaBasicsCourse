package WhileLoop2;
import java.util.Scanner;
public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int counter2=0;
        int numBadMarks=Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        int mark= Integer.parseInt(scanner.nextLine());
        double average=0;
        String lastProblem="";
        while(!(name.equals("Enough"))){
            if(mark<=4){
                counter++;
            }
            if(counter==numBadMarks){
                break;
            }

            counter2++;
            average+=mark;
            lastProblem=name;
            name = scanner.nextLine();
            if(!(name.equals("Enough")))
            mark = Integer.parseInt(scanner.nextLine());
        }
        if(counter==numBadMarks){
            System.out.printf("You need a break, %d poor grades.", counter);
        }
        else{
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",average/counter2,counter2,lastProblem);
        }

    }
}
