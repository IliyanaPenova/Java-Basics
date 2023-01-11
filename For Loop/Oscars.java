package ForLoop.Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double score =Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            int length = name.length();
            score = score + (length * juryPoints) / 2;
            if (score >= 1250.50) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, score);
                break;
            }
        }
        if (score < 1250.50) {
            System.out.printf("Sorry, %s you need %.1f more!",nameActor,1250.50-score);
        }



        }

}
