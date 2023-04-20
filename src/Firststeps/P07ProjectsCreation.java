package Firststeps;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."
        Scanner scanner= new Scanner(System.in);
        String architectName= scanner.nextLine();
        int projects=Integer.parseInt(scanner.nextLine());

        int neededHours=projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, neededHours, projects );

    }
}
