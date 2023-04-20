package WhileLoop1;
import java.util.Scanner;
public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name= scanner.nextLine();
        String password = scanner.nextLine();

        while (true) {

            String passwordTyped= scanner.nextLine();

            if(passwordTyped.equals(password)){
                System.out.printf("Welcome %s!", name);
                break;
            }

        }



        }
    }

