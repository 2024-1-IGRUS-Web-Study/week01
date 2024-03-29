package week1;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class baseball_game {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ArrayList<Integer> randomball = new ArrayList<>();

        while(randomball.size() < 3)
        {
            int randomnumber = (int)(Math.random() * 10);
            if(!randomball.contains(randomnumber)) {
                randomball.add(randomnumber);
            }
        }

        while(true)
        {
            System.out.println("3자리 숫자를 입력해주세요>> ");
            String answer = cin.nextLine();
            ArrayList<Integer> input = new ArrayList<>();
            for(char ch : answer.toCharArray())
            {
                input.add(ch - '0');
            }

            int strike = 0;
            int ball = 0;
            int out = 0;

            for(int i = 0; i<3; i++) {
                if (randomball.get(i).equals(input.get(i)))
                    strike++;
                else if (randomball.contains(input.get(i)))
                    ball++;
                else if(!randomball.contains(input.get(i)))
                    out++;
            }

            System.out.println("Strike: " + strike);
            System.out.println("Ball: " + ball);
            System.out.println("Out: " + out);

            if(strike == 3)
            {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
