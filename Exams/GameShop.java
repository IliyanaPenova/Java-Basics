package SoftUniSummerExam;

import java.util.Scanner;

public class GameShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int gamesSold=Integer.parseInt(scanner.nextLine());

        int hearthStone=0;
        int fornite=0;
        int overwatch=0;
        int others=0;

        for (int i = 1; i <=gamesSold ; i++) {
            String game= scanner.nextLine();
            if(game.equals("Hearthstone")){
                hearthStone++;
            }else if(game.equals("Fornite")){
                fornite++;
            }else if(game.equals("Overwatch")){
                overwatch++;
            }else{
                others++;
            }

        }
        double heartstonePercent=hearthStone*1.00/gamesSold*100;
        double fornitePercent=fornite*1.00/gamesSold*100;
        double overwatchPercent=overwatch*1.00/gamesSold*100;
        double othersPercent=others*1.00/gamesSold*100;

        System.out.printf("Hearthstone - %.2f%%%n",heartstonePercent);
        System.out.printf("Fornite - %.2f%%%n",fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n",overwatchPercent);
        System.out.printf("Others - %.2f%%%n",othersPercent);


    }
}
