package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen= Integer.parseInt(scanner.nextLine());
        int boat=0;
        double sum=0;
        double difference=0;



        if(season.equals("Spring")){
           boat = 3000;
           if(fishermen%2==0){
               if(fishermen<=6){
                   sum=boat*0.85;
                   if(budget>=sum){
                       difference=budget-sum;
                       System.out.printf("Yes! You have %.2f leva left." , difference);
                   }
                   else {
                       difference = sum-budget ;
                       System.out.printf("Not enough money! You need %.2f leva.",difference);
                   }

           }
           else if(fishermen>=7 && fishermen<=11){
                   sum=boat*0.80;
                   if(budget>=sum){
                       difference=budget-sum;
                       System.out.printf("Yes! You have %.2f leva left." , difference);
                   }
                   else {
                       difference = sum-budget ;
                       System.out.printf("Not enough money! You need %.2f leva.",difference);
                   }

           }
           else if(fishermen>12){
                   sum=boat*0.70;
                   if(budget>=sum){
                       difference=budget-sum;
                       System.out.printf("Yes! You have %.2f leva left." , difference);
                   }
                   else {
                       difference = sum-budget ;
                       System.out.printf("Not enough money! You need %.2f leva.",difference);
                   }

           }
           }
           else {
               if(fishermen<=6){
                   sum=boat*0.90;
                   if(budget>=sum){
                       difference=budget-sum;
                       System.out.printf("Yes! You have %.2f leva left." , difference);
                   }
                   else {
                       difference = sum-budget ;
                       System.out.printf("Not enough money! You need %.2f leva.",difference);
                   }
               }
               else if(fishermen>=7 && fishermen<=11){
                   sum=boat*0.85;
                   if(budget>=sum){
                       difference=budget-sum;
                       System.out.printf("Yes! You have %.2f leva left." , difference);
                   }
                   else {
                       difference = sum-budget ;
                       System.out.printf("Not enough money! You need %.2f leva.",difference);
                   }

               }
               else if(fishermen>12){
                   sum=boat*0.75;
                   if(budget>=sum){
                       difference=budget-sum;
                       System.out.printf("Yes! You have %.2f leva left." , difference);
                   }
                   else {
                       difference = sum-budget ;
                       System.out.printf("Not enough money! You need %.2f leva.",difference);
                   }

               }

           }


        }
       else if(season.equals("Summer")){
            boat = 4200;
            if(fishermen%2==0){
                if(fishermen<=6){
                    sum=boat*0.85;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>=7 && fishermen<=11){
                    sum=boat*0.80;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>12){
                    sum=boat*0.70;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
            }
            else {
                if(fishermen<=6){
                    sum=boat*0.90;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }
                }
                else if(fishermen>=7 && fishermen<=11){
                    sum=boat*0.85;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>12){
                    sum=boat*0.75;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }

            }

        }
       else if(season.equals("Autumn")){
            boat = 4200;

                if(fishermen<=6){
                    sum=boat*0.90;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }
                }
                else if(fishermen>=7 && fishermen<=11){
                    sum=boat*0.85;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>12){
                    sum=boat*0.75;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }



        }
       else if(season.equals("Winter")){
            boat = 2600;
            if(fishermen%2==0){
                if(fishermen<=6){
                    sum=boat*0.85;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>=7 && fishermen<=11){
                    sum=boat*0.80;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>12){
                    sum=boat*0.70;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
            }
            else {
                if(fishermen<=6){
                    sum=boat*0.90;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }
                }
                else if(fishermen>=7 && fishermen<=11){
                    sum=boat*0.85;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }
                else if(fishermen>12){
                    sum=boat*0.75;
                    if(budget>=sum){
                        difference=budget-sum;
                        System.out.printf("Yes! You have %.2f leva left." , difference);
                    }
                    else {
                        difference = sum-budget ;
                        System.out.printf("Not enough money! You need %.2f leva.",difference);
                    }

                }

            }


        }
    }
}
