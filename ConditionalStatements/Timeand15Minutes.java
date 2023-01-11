package ConditionalStatements;

import java.util.Scanner;

public class Timeand15Minutes {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int TotalMin= hour * 60 + min + 15;
        int newHour = TotalMin /60;
        int newMin = TotalMin %60;

        if (newHour == 24){
            newHour = 0;
        }

        System.out.printf("%d:%02d",newHour,newMin);

    }
}
