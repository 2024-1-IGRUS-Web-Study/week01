import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;
        int input1, input2, input3;
        while (true) {
            num1 = (int) (Math.random() * 10) + 1;
            num2 = (int) (Math.random() * 10) + 0;
            num3 = (int) (Math.random() * 10) + 0;
            if (num1 != num2 && num2 != num3 && num1 != num3) {
                break;
            }
        }

        while (true) {
            int strike = 0, ball = 0, out = 0;

            while(true){
                System.out.println("숫자를 입력하세요");
                input1 = scanner.nextInt();
                input2 = scanner.nextInt();
                input3 = scanner.nextInt();
                if(input1 != input2 && input2 != input3 && input3 != input1) break;
            }


            if (num1 == input1) strike++;
            if (num2 == input2) strike++;
            if (num3 == input3) strike++;

            if (num1 == input2 || num1 == input3) ball++;
            if (num2 == input1 || num2 == input3) ball++;
            if (num3 == input1 || num3 == input2) ball++;

            else if (strike + ball < 3) out = 3 - strike - ball;


            if (strike == 3) {
                System.out.println("정답입니다!");
                break;
            } else {
                System.out.printf("Strike: %d%n", strike);
                System.out.printf("Ball: %d%n", ball);
                System.out.printf("Out: %d%n", out);

            }


        }


    }

}
