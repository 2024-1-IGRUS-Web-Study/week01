import java.util.Random;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 중복되지 않는 3자리 숫자 생성
        int[] randomDigits = generateRandomDigits();

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("세 자리 숫자를 입력하세요 (중복된 숫자는 사용할 수 없습니다).");
        System.out.println("종료하려면 'exit'을 입력하세요.");

        while (true) {
            System.out.print("입력: ");
            String input = scanner.nextLine();


            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


            if (input.length() != 3 || !input.matches("[0-9]+")) {
                System.out.println("세 자리 숫자를 입력하세요.");
                continue;
            }


            int[] guess = new int[3];
            for (int i = 0; i < 3; i++) {
                guess[i] = Character.getNumericValue(input.charAt(i));
            }


            int[] result = compare(randomDigits, guess);
            System.out.println("결과: Strike: " + result[0] + ", Ball: " + result[1] + ", Out: " + result[2]);


            if (result[0] == 3) {
                System.out.println("정답입니다!");
                break;
            }
        }

        scanner.close();
    }


    private static int[] generateRandomDigits() {
        Random random = new Random();
        int[] digits = new int[3];
        boolean[] used = new boolean[10]; // 각 자리수가 사용되었는지 여부를 저장하는 배열

        for (int i = 0; i < 3; i++) {
            int num;
            do {
                num = random.nextInt(10);
            } while (used[num]);
            digits[i] = num;
            used[num] = true;
        }

        return digits;
    }


    private static int[] compare(int[] randomDigits, int[] guess) {
        int[] result = new int[3];
        boolean[] checked = new boolean[3]; // 중복 체크를 위한 배열

        // Strike 계산
        for (int i = 0; i < 3; i++) {
            if (randomDigits[i] == guess[i]) {
                result[0]++;
                checked[i] = true;
            }
        }


        for (int i = 0; i < 3; i++) {
            if (!checked[i]) {
                for (int j = 0; j < 3; j++) {
                    if (i != j && randomDigits[i] == guess[j]) {
                        result[1]++;
                        break;
                    }
                }
            }
        }

        result[2] = 3 - result[0] - result[1];

        return result;
    }
}
