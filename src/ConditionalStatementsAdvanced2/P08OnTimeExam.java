package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P08OnTimeExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam= Integer.parseInt(scanner.nextLine());
        int minutesExam= Integer.parseInt(scanner.nextLine());
        int hourMe= Integer.parseInt(scanner.nextLine());
        int minutesMe=Integer.parseInt(scanner.nextLine());

        int differenceH = hourExam-hourMe;
        int differenceM = minutesExam-minutesMe;

        if(differenceH==0){
            if(differenceM<0){
                int differenceMMinus=-differenceM;
                System.out.printf("Late%n%d minutes after the start%n", differenceMMinus);
            }
            else if(differenceM>0 && differenceM<=30){

                System.out.printf("On time%n%d minutes before the start%n", differenceM);


            }
            else if(differenceM>30){
                System.out.printf("Early%n%d minutes before the start%d", differenceM);
            }
            else if(differenceM==0){

                System.out.printf("On time");
            }

        }

        else if(differenceH>0){
            if(differenceM<0){
                int rightTime=60 + differenceM;
                if(rightTime<=30){
                    System.out.printf("On time%n%d minutes before the start%n", rightTime);

                }
                else if(rightTime>30){
                    System.out.printf("Early%n%d minutes before the start%n", rightTime);
                }
            }
            else if(differenceM==0){
                System.out.printf("Early%n%d:00 hours before the start%n", differenceH);
            }
            else if(differenceM>0){
                if(differenceM>0 && differenceM<10){
                    System.out.printf("Early%n%d:0%d hours before the start%n", differenceH,differenceM);
                }
                else{
                System.out.printf("Early%n%d:%d hours before the start%n", differenceH,differenceM);
                }
            }

        }
        else if(differenceH<0){
            if(differenceM<0){
                int differenceMMinus=-differenceM;
                int differenceHHour=-differenceH;
                if(differenceMMinus>0 && differenceMMinus<10){
                System.out.printf("Late%n%d:0%d hours after the start%n", differenceHHour, differenceMMinus);
                }
                else{
                    System.out.printf("Late%n%d:%d hours after the start%n", differenceHHour, differenceMMinus);
                }
            }
            else if(differenceM==0){
                int differenceHHour=-differenceH;

                System.out.printf("Late%n%d:00 hours after the start%n", differenceHHour);

            }
            else if(differenceM>0){
                int rightTime=60 - differenceM;
                System.out.printf("Late%n%d minutes after the start%n", rightTime);
            }






        }

    }
}
