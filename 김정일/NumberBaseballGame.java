import java.util.Scanner;
import java.util.Random;

public class NumberBaseballGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomArr[] = new int[3];
        int num;

        while(true){

            randomArr[0] = random.nextInt(9) + 1;
            randomArr[1] = random.nextInt(10);
            randomArr[2] = random.nextInt(10);

            while(randomArr[0] == randomArr[1] || randomArr[0] == randomArr[2] || randomArr[1] == randomArr[2]) {
                randomArr[0] = random.nextInt(9) + 1;
                randomArr[1] = random.nextInt(10);
                randomArr[2] = random.nextInt(10);
            }

            while(true){
                System.out.print("3자리 숫자를 입력해주세요>> ");
                String input = scan.next();

                if(input.equals("exit")){
                    System.out.println("프로그램을 종료합니다.");
                    scan.close();
                    return;
                }

                num = Integer.parseInt(input);
                int[] numArr = new int [3];
                numArr[0] = num/100;
                numArr[1] = (num/10)%10;
                numArr[2] = num%10;

                int strike = 0;
                int ball = 0;
                int out = 0;

                for(int i = 0; i<3; i++){
                    for(int j = 0; j < 3; j++)
                        if(numArr[i] == randomArr[j]) {
                            if (i == j) strike++;
                            else ball++;
                        }
                }
                out = 3 - strike - ball;

                System.out.println("Strike: " + strike);
                System.out.println("Ball: " + ball);
                System.out.println("Out: " + out);

                if(strike == 3){
                    System.out.println("정답입니다");
                    break;
                }
            }

        }

    }
}
