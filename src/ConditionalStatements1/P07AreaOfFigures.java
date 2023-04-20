package ConditionalStatements1;
import java.util.Scanner;
public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String form = scanner.nextLine();

        if(form.equals("square")){
            double a= Double.parseDouble(scanner.nextLine());
            double S= a*a;
            System.out.printf("%.3f", S);
        }
        else if(form.equals("rectangle")){
            double a= Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double S= a*b;
            System.out.printf("%.3f", S);
        }
        else if(form.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            double S=Math.PI*r*r;
            System.out.printf("%.3f", S);

        }
        else if(form.equals("triangle")){
            double a= Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());

            double S= (a*h)/2;
            System.out.printf("%.3f", S);
        }

    }
}
