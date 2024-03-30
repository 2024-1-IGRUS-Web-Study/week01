import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {

        //랜덤숫자생성
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int firstrandom1to9 = random.nextInt(9) + 1;

        int secondrandom0to9;
        do {
            secondrandom0to9 = random.nextInt(10);
        } while (firstrandom1to9 == secondrandom0to9);

        int thirdrandom0to9;
        do {
            thirdrandom0to9 = random.nextInt(10);
        } while (firstrandom1to9 == thirdrandom0to9 || secondrandom0to9 == thirdrandom0to9);
        int randomnumber = firstrandom1to9 * 100 + secondrandom0to9 * 10 + thirdrandom0to9;
        System.out.println("Random number is " + firstrandom1to9 + secondrandom0to9 + thirdrandom0to9);
        boolean exitbutton = true;
        // 게임 시작!
        do {
            int input_number;
            do {
                System.out.println("3자리 숫자를 입력해주세요>>");
                String userinput = scanner.nextLine();
                if (userinput == "exit") {
                    exitbutton = false;
                }
                input_number = 0;
                input_number = scanner.nextInt();
                int thirdnumber = input_number % 10;
                int secondnumber = (input_number / 10) % 10;
                int firstnumber = input_number / 100;

                int strikecount = 0;
                int ballcount = 0;
                int outcount = 3;

                if (thirdnumber == thirdrandom0to9) {
                    strikecount++;
                    outcount--;
                }
                if (thirdnumber == secondrandom0to9 || thirdnumber == firstrandom1to9) {
                    ballcount++;
                    outcount--;
                }
                if (secondnumber == secondrandom0to9) {
                    strikecount++;
                    outcount--;
                }
                if (secondnumber == firstrandom1to9 || secondnumber == thirdrandom0to9) {
                    ballcount++;
                    outcount--;
                }
                if (firstnumber == firstrandom1to9) {
                    strikecount++;
                    outcount--;
                }
                if (firstnumber == secondrandom0to9 || firstnumber == thirdrandom0to9) {
                    ballcount++;
                    outcount--;
                }

                System.out.println("Strike: " + strikecount);
                System.out.println("Ball: " + ballcount);
                System.out.println("Out: " + outcount);
            } while (randomnumber != input_number);
            System.out.println("정답입니다!");

            break;
        }while(true);
    }
}
