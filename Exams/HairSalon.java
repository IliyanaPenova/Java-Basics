package SoftUniExam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int money=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        int allMoney=0;
        while(!command.equals("closed")) {
            String type = scanner.nextLine();

            if (command.equals("haircut")) {

                if (type.equals("mens")) {
                    allMoney += 15;
                } else if (type.equals("ladies")) {
                    allMoney += 20;
                } else if (type.equals("kids")) {
                    allMoney += 10;
                }
            }

            if (command.equals("color")) {
                if (type.equals("touch up")) {
                    allMoney += 20;

                } else if (type.equals("full color")) {
                    allMoney += 30;

                }
            }
            if(allMoney>=money){
                break;
            }
            command=scanner.nextLine();
        }
        if (allMoney>=money){
            System.out.printf("You have reached your target for the day!%nEarned money: %dlv.",allMoney);
        }else{
            System.out.printf("Target not reached! You need %dlv. more.%n",Math.abs(money-allMoney));
            System.out.printf("Earned money: %dlv.",allMoney);
        }

    }
}



