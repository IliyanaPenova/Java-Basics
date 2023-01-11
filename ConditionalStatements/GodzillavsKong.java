package ConditionalStatements;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double statistsclothesPrice = statists * clothesPrice ;

        if (statists>150){
            statistsclothesPrice = statistsclothesPrice - (statistsclothesPrice*0.10);
        }

        double totalPrice = decorPrice +statistsclothesPrice;
        if(budget>=totalPrice){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalPrice);

        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget-totalPrice));
        }

    }
}
