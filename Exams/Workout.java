package SoftUniExam;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double m=Double.parseDouble(scanner.nextLine());
        double sum=m;
        for (int i = 0; i < n; i++) {
            double nextDay = Double.parseDouble(scanner.nextLine());
            m = m + m * (nextDay / 100);
            sum += m;
        }
        if(sum>=1000) {
            sum = Math.ceil(sum - 1000);
            System.out.printf("You've done a great job running %.0f more kilometers!", sum);
        }else{
            sum=Math.ceil(1000-sum);
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers",sum);
            
        }
        
    }
}
