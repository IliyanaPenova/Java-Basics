package NestedLoopsExercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countKid=0;
        int countStandard=0;
        int countStudent=0;
        int count=0;
        String movie= scanner.nextLine();
        while(!movie.equals("Finish")){
            int freeSeats=Integer.parseInt(scanner.nextLine());
            int currentCounter=0;

            String input= scanner.nextLine();
            while(!input.equals("End")){

                currentCounter++;
                count++;
                switch (input){
                    case "standard":
                        countStandard++;
                        break;
                    case "student":
                        countStudent++;
                        break;
                    case "kid":
                        countKid++;
                        break;

                }
                if(currentCounter==freeSeats){
                    break;
                }
                input= scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",movie,currentCounter*1.00/freeSeats*100);

            movie= scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n",count);
        System.out.printf("%.2f%% student tickets.%n",countStudent*1.00/count*100);
        System.out.printf("%.2f%% standard tickets.%n",countStandard*1.00/count*100);
        System.out.printf("%.2f%% kids tickets.",countKid*1.00/count*100);
    }
}
