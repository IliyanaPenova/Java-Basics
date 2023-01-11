package SoftUniExam;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b > a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        int sum = a + b + c + d;
                        int mult = a * b * c * d;
                        if (sum == mult && num % 10 == 5) {

                            System.out.printf("%d%d%d%d%n", a, b, c, d);
                            return;

                        }
                        else  if (mult / sum == 3 && num % 3 == 0) {

                            System.out.printf("%d%d%d%d%n", d, c, b, a);
                            return;
                        }

                    }

                }
            }
        }

            System.out.println("Nothing found");



    }
}



