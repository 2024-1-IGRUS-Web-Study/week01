// 자바에서 정수를 입력받기 위한 방법 중 하나
// Scanner 클래스를 통해 정수 입력받기
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        while (true) {
            System.out.println("==== 지원하는 연산 ====");
            System.out.println("1.  +  (더하기)");
            System.out.println("2.  -  (빼기)");
            System.out.println("3.  *  (곱하기)");
            System.out.println("4.  /  (몫)");
            System.out.println("5.  %  (나머지)");
            System.out.println("6.  종료");

            System.out.print("수행하고 싶은 연산을 선택해주세요>>");
            Scanner sc = new Scanner(System.in); // 값을 입력받기 위해 Scanner 모듈 가져오기
            int input = sc.nextInt(); // Scanner 클래스의 nextInt 함수를 사용해서 정수 입력받기
            if(input == 6){
                System.out.println("프로그램이 종료되었습니다.");
                break;
            };

            System.out.print("첫 번째 피연산자를 입력해주세요>>");
            int num1 = sc.nextInt(); // Scanner 클래스의 nextInt 함수를 사용해서 정수 입력받기
            System.out.print("두 번째 피연산자를 입력해주세요>>");
            int num2 = sc.nextInt(); // Scanner 클래스의 nextInt 함수를 사용해서 정수 입력받기

            char x = ' '; // 기본값으로 공백 문자를 할당
            int result = 0; // 기본값으로 0을 할당

            if(input == 1) {
                x = '+';
                result = num1 + num2;
            } else if(input == 2) {
                x = '-';
                result = num1 - num2;

            } else if(input == 3) {
                x = '*';
                result = num1 * num2;

            } else if(input == 4) {
                x = '/';
                result = num1 / num2;

            } else if(input == 5 ) {
                x = '%';
                result = num1 % num2;
            }

            // System.out.println() 메소드는  형식 지정자를 사용하지 않음
            System.out.printf("%d %c %d = %d\n", num1, x, num2, result);

        }
    }
}
