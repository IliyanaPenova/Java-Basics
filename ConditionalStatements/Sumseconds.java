package ConditionalStatements;

import java.util.Scanner;

public class Sumseconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f =Integer.parseInt(scanner.nextLine());
        int s =Integer.parseInt(scanner.nextLine());
        int t =Integer.parseInt(scanner.nextLine());

        int sumSec= f + s + t;
        int min = sumSec /60;
        int sec = sumSec % 60;

        System.out.printf("%d:%02d",min,sec);

    }
}
