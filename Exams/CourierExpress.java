package SoftUniExam;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        double overprice=0.0;
        double price1=0.0;
        switch (type) {
            case "standard":
                if (weight < 1) {
                    price = distance * 0.03;
                    break;
                } else if (weight >= 1 && weight < 10) {
                    price = distance * 0.05;
                    break;
                } else if (weight >= 10 && weight < 40) {
                    price = distance * 0.10;
                    break;
                } else if (weight >= 40 && weight < 90) {
                    price = distance * 0.15;
                    break;
                } else if (weight >= 90 && weight < 150) {
                    price = distance * 0.20;
                    break;
                }
            case "express":
                //Надценка за услуга express:
                //Надценка на кг: 2% от 0.15 лв. = 0.003 лв.
                //Надценка за км: 87 кг. по 0.003 лв. = 0.261 лв.
                //Надценка за км: 87 кг. по 0.003 лв. = 0.261 лв.
                //Общо надценка: 130 км. по 0.261 лв. = 33.93 лв.
                //Обща стойност: 19.50 лв. + 33.93 лв. = 53.43 лв.
                if (weight < 1) {
                    overprice = 0.80*0.03;
                    price1 = distance * 0.03;
                    price= distance*weight*overprice+price1;
                    break;
                } else if (weight >= 1 && weight < 10) {
                    overprice = 0.40 *0.05;
                    price1=distance*0.05;
                    price= distance*weight*overprice+price1;
                    break;
                } else if (weight >= 10 && weight < 40) {
                    overprice = 0.05*0.10;
                    price1=distance*0.10;
                    price= distance*weight*overprice+price1;
                    break;
                } else if (weight >= 40 && weight < 90) {
                    overprice=0.02*0.15;
                    price1=distance*0.15;
                    price= distance*weight*overprice+price1;
                    break;
                } else if (weight >= 90 && weight < 150) {
                    overprice=0.01*0.20;
                    price1=distance*0.20;
                    price= distance*weight*overprice+price1;
                    break;

                }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,price);
    }
}
