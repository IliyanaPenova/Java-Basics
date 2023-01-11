package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int jury=Integer.parseInt(scanner.nextLine());
        String presentation= scanner.nextLine();
        double totalGrades=0;
        double countGrades=0;


        while(!presentation.equals("Finish")){

          double sumCurrentPresGrades=0;
            for (int i = 1; i <=jury ; i++) {
                double grade=Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentPresGrades=sumCurrentPresGrades+grade;
            }
           totalGrades=totalGrades+sumCurrentPresGrades;
            System.out.printf("%s - %.2f.%n",presentation,sumCurrentPresGrades/jury);
            presentation = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.",totalGrades/countGrades);
    }
}
