package ConditionalStatementsAdvanced2;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String kindRoses = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int budget =Integer.parseInt(scanner.nextLine());
       if(kindRoses.equals("Roses")){
           if(num>80){
               double sum= (num*5)*0.9;
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }
           }
           else{
               double sum= (num*5);
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }

           }

       }
       else if(kindRoses.equals("Dahlias")){
           if(num>90){
               double sum= (num*3.80)*0.85;
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }
           }
           else{
               double sum= (num*3.80);
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }

           }

       }
       else if(kindRoses.equals("Tulips")){
           if(num>80){
               double sum= (num*2.80)*0.85;
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }
           }
           else{
               double sum= (num*2.80);
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }

           }

       }
       else if(kindRoses.equals("Narcissus")){
           if(num<120){
               double sum= (num*3)*1.15;
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }
           }
           else{
               double sum= (num*3);
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }

           }

       }
       else if(kindRoses.equals("Gladiolus")){
           if(num<80){
               double sum= (num*2.50)*1.20;
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }
           }
           else{
               double sum= (num*2.50);
               if(sum<budget){
                   double minus= budget - sum;
                   System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, kindRoses,minus);
               }
               else{
                   double needed = sum-budget;
                   System.out.printf("Not enough money, you need %.2f leva more.",needed );
               }

           }

       }


    }
}
