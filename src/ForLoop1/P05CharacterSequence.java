package ForLoop1;
import java.util.Scanner;
public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a
        String name = scanner.nextLine();

        for(int i=0; i<name.length(); i++){
            char letter = name.charAt(i);
            System.out.println(letter);

        }

    }
}
