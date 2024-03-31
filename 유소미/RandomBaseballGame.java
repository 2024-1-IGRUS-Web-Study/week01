//입력 값들을 읽어들이기 위한 기능
import java.util.Scanner;
public class NumberBaseballGame {
    public static void main(String[] args) {
        char[] arr = new char[3];
        int i = 0;
        int j = 0;
        String concatenated = ""; // 배열을 문자열로 변환하기 위한 변수
        for(i=0;i<arr.length;i++){
            arr[i]= (char)(Math.random() * 10 + '0'); // 숫자에 '0'을 더하여 ASCII 코드를 문자로 변환
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    i--;
                    break;
                }
            }
            concatenated += arr[i];
        }
        System.out.println(concatenated);

        while(true){
            int strike_cnt = 0;
            int ball_cnt = 0;
            int out_cnt = 0;

            System.out.print("3자리 숫자를 입력해주세요>> ");
            Scanner sc = new Scanner(System.in); // 값을 입력받기 위해 Scanner 모듈 가져오기
            String str = sc.nextLine(); // Scanner 클래스의 nextLine 함수를 사용해서 문자열 입력받기
            if(str.equals("exit")) {
                break;
            }

            char[] charArray = str.toCharArray();

            for (i = 0; i < arr.length; i++) {
                for (j = 0; j < arr.length; j++) {
                    if (i == j && arr[i] == charArray[j]) {
                        strike_cnt += 1;
                    } else if (i != j && arr[i] == charArray[j]) {
                        ball_cnt += 1;
                    }
                }
            }

            out_cnt = arr.length - strike_cnt - ball_cnt;

            System.out.printf("Strike: %d\n", strike_cnt);
            System.out.printf("Ball: %d\n", ball_cnt);
            System.out.printf("Out: %d\n", out_cnt);

            if(strike_cnt==3){
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
