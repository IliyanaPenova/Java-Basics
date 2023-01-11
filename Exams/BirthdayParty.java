package SoftUniSummerExam;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double placePrice= Double.parseDouble(scanner.nextLine());
        double cakePrice=0.20*placePrice;
        double drinksPrice= cakePrice-cakePrice*0.45;
        double animatorPrice= 1.00/3*placePrice;
        double budget=placePrice+cakePrice+drinksPrice+animatorPrice;
        System.out.println(budget);
    }
}
