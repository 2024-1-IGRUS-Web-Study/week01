import java.util.Scanner;
import java.util.Random;

public class NumberBaseballGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int randomarr[] = new int[3];
        int num;

        while(true){

            randomarr[0] = random.nextInt(9) + 1;
            randomarr[1] = random.nextInt(10);
            randomarr[2] = random.nextInt(10);

            while(randomarr[0] == randomarr[1] || randomarr[0] == randomarr[2] || randomarr[1] == randomarr[2]) {
                randomarr[0] = random.nextInt(9) + 1;
                randomarr[1] = random.nextInt(10);
                randomarr[2] = random.nextInt(10);
            }

            while(true){
                System.out.print("3자리 숫자를 입력해주세요>> ");
                String input = scan.next();

                if(input.equals("exit")){
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }

                num = Integer.parseInt(input);
                int[] numarr = new int [3];
                numarr[0] = num/100;
                numarr[1] = (num/10)%10;
                numarr[2] = num%10;

                int strike = 0;
                int ball = 0;
                int out = 0;

                for(int i = 0; i<3; i++){
                    for(int j = 0; j<3; j++){
                        if(numarr[i] == randomarr[j] && i == j){
                            strike++;
                        }
                        else if (numarr[i] == randomarr[j] && i != j){
                            ball++;
                        }
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
