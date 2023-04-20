package WhileLoop2;
import java.util.Scanner;
public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        String name= scanner.nextLine();
        String searching=scanner.nextLine();
        while(!(searching.equals(name))){
            if(searching.equals("No More Books")){
                break;
            }
            counter++;
            searching= scanner.nextLine();
        }
        if(searching.equals("No More Books")){
            System.out.printf("The book you search is not here!%nYou checked %d books.",counter);
        }
        else {
            System.out.printf("You checked %d books and found it.", counter);
        }

    }
}
