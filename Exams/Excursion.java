package SoftUniExam;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double group = Double.parseDouble(scanner.nextLine());
        int nights= Integer.parseInt(scanner.nextLine());
        int cards =Integer.parseInt(scanner.nextLine());
        int ticketsMuseum=Integer.parseInt(scanner.nextLine());

        double priceNights= nights*20;
        double priceCards= cards*1.60;
        double priceTickets= ticketsMuseum*6;
        double allprice = (priceCards+priceNights+priceTickets) * group*1.00;
        double finalPrice=allprice+(0.25*allprice);
        System.out.printf("%.2f",finalPrice);
    }
}
