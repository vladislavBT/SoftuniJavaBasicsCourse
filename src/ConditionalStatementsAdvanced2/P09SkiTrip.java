package ConditionalStatementsAdvanced2;
import java.util.Scanner;
public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String tape = scanner.nextLine();
        String mark = scanner.nextLine();
        double price= 0;
        double newPrice=0;
        double newNewPrice=0;
        int nights=days-1;

        if(days<10){
            if(tape.equals("room for one person")){
                price=nights*18.00;
                if(mark.equals("positive")){
                    newNewPrice=price*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=price*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }
            else if(tape.equals("apartment")){
                price=nights*25.00;
                newPrice=price*0.70;
                if(mark.equals("positive")){
                    newNewPrice=newPrice*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=newPrice*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }
            else if(tape.equals("president apartment")){
                price=nights*35.00;
                newPrice=price*0.90;
                if(mark.equals("positive")){
                    newNewPrice=newPrice*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=newPrice*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }

            }
        else if(days>=10 && days<=15){
            if(tape.equals("room for one person")){
                price=nights*18.00;
                if(mark.equals("positive")){
                    newNewPrice=price*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=price*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }
            else if(tape.equals("apartment")){
                price=nights*25.00;
                newPrice=price*0.65;
                if(mark.equals("positive")){
                    newNewPrice=newPrice*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=newPrice*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }
            else if(tape.equals("president apartment")){
                price=nights*35.00;
                newPrice=price*0.85;
                if(mark.equals("positive")){
                    newNewPrice=newPrice*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=newPrice*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }

        }
        else if(days>15){
            if(tape.equals("room for one person")){
                price=nights*18.00;
                if(mark.equals("positive")){
                    newNewPrice=price*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=price*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }
            else if(tape.equals("apartment")){
                price=nights*25.00;
                newPrice=price*0.50;
                if(mark.equals("positive")){
                    newNewPrice=newPrice*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=newPrice*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }
            else if(tape.equals("president apartment")){
                price=nights*35.00;
                newPrice=price*0.80;
                if(mark.equals("positive")){
                    newNewPrice=newPrice*1.25;
                    System.out.printf("%.2f", newNewPrice);
                }
                else if(mark.equals("negative")){
                    newNewPrice=newPrice*0.90;
                    System.out.printf("%.2f", newNewPrice);
                }

            }

        }


        }

    }

