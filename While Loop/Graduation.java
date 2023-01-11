package WhileLoopLab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name= scanner.nextLine();

        int poorGrades=0;
        int goodGradescounter=0;
        int gradeCounter=1;
        double allGrades=0;

        while(goodGradescounter<12){

            if(poorGrades==2){
                break;
            }
            double currentGrade=Double.parseDouble(scanner.nextLine());


            if(currentGrade<4){
                poorGrades++;
                continue;
            }
            goodGradescounter++;
            allGrades+=currentGrade;
            gradeCounter++;

        }
        if(gradeCounter>=12){
            System.out.printf("%s graduated. Average grade: %.2f",name,allGrades/goodGradescounter);
        }else{
            System.out.printf("%s has been excluded at %s grade",name,gradeCounter);
        }
    }
}
