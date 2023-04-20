package Secondsteps;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pagesOfBook= Integer.parseInt(scanner.nextLine());
        int pagesPerHour= Integer.parseInt(scanner.nextLine());
        int numberOfDays= Integer.parseInt(scanner.nextLine());

        int numberOfHours= pagesOfBook/pagesPerHour;
        int answer= numberOfHours/numberOfDays;

        System.out.println(answer);
    }
}
