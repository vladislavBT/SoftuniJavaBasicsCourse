package Exam;
import java.util.Scanner;
public class P03CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cat= scanner.nextLine();
        String gender= scanner.nextLine();

        int humanMonths;
        int catMonths;

        if(cat.equals("British Shorthair")){
            if(gender.equals("m")){
                humanMonths=13*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
            else if(gender.equals("f")){
                humanMonths=14*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
        }
        else if(cat.equals("Siamese")){
            if(gender.equals("m")){
                humanMonths=15*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
            else if(gender.equals("f")){
                humanMonths=16*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
        }
        else if(cat.equals("Persian")){
            if(gender.equals("m")){
                humanMonths=14*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
            else if(gender.equals("f")){
                humanMonths=15*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
        }
        else if(cat.equals("Ragdoll")){
            if(gender.equals("m")){
                humanMonths=16*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
            else if(gender.equals("f")){
                humanMonths=17*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
        }
        else if(cat.equals("American Shorthair")){
            if(gender.equals("m")){
                humanMonths=12*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
            else if(gender.equals("f")){
                humanMonths=13*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
        }
        else if(cat.equals("Siberian")){
            if(gender.equals("m")){
                humanMonths=11*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
            else if(gender.equals("f")){
                humanMonths=12*12;
                catMonths=humanMonths/6;
                System.out.printf("%d cat months",catMonths);
            }
        }
        else{
            System.out.printf("%s is invalid cat!",cat);
        }
    }
}
