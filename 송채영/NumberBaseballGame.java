import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class NumberBaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("3자리 숫자를 입력해주세요>> ");
            String num = sc.nextLine();
            if (num.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (num.length() != 3) {
                return;
            }

            Set<Integer> set = new HashSet<>();

            while (set.size() < 3) {
                int randomNum = (int) (Math.random() * 9) + 1; // 1부터 9 사이의 랜덤 숫자 생성
                set.add(randomNum);
            }

            StringBuilder result = new StringBuilder();
            for (int n : set) {
                result.append(n);
            }

            System.out.println(result.toString());

            int Strike = 0, Ball = 0, Out = 0;
            for (int i = 0; i < 3; i++) {
                char c = num.charAt(i);
                if (result.toString().charAt(i) == c) {
                    Strike++;
                } else if (result.toString().contains(String.valueOf(c))) {
                    Ball++;
                } else {
                    Out++;
                }
            }
            System.out.println("Strike: " + Strike + "\nBall: " + Ball + "\nOut: " + Out);
            if (Strike == 3) {
                System.out.println("정답입니다!");
            }
        }
    }
}

