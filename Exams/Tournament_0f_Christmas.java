package SoftUniSummerExam;
import java.util.Scanner;
public class Tournament_0f_Christmas {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int tournamentDays = Integer.parseInt(scanner.nextLine());

            int totalWinsCount = 0;
            int totalLosesCount = 0;
            double totalRaisedMoney = 0;
            for (int i=1;i<=tournamentDays ;i++){

                String command = scanner.nextLine();

                int winsCount = 0;
                int losesCount = 0;
                double raisedMoney = 0;

                while (!command.equals("Finish")) {
                    String sport = command;
                    String result = scanner.nextLine();

                    switch (result) {
                        case "win":
                            winsCount++;
                            raisedMoney += 20;
                            break;
                        case "lose":
                            losesCount++;
                            break;
                    }

                    command = scanner.nextLine();
                }

                if (winsCount > losesCount) {
                    raisedMoney *= 1.1;
                }

                totalWinsCount += winsCount;
                totalLosesCount += losesCount;
                totalRaisedMoney += raisedMoney;

            }

            if(totalWinsCount >totalLosesCount)

            {
                totalRaisedMoney *= 1.2;
                System.out.printf("You won the tournament! Total raised money: %.2f", totalRaisedMoney);
            } else

            {
                System.out.printf("You lost the tournament! Total raised money: %.2f", totalRaisedMoney);
            }
        }


    }
