import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수행하고 싶은 연산을 선택해주세요>> ");
        int a = scanner.nextInt();



        switch (a) {
            case 1:
                System.out.print("첫번째 피연산자를 입력해주세요>> ");
                int num1 = scanner.nextInt();

                System.out.print("두번째 피연산자를 입력해주세요>> ");
                int num2 = scanner.nextInt();

                System.out.print(num1 +" + "+ num2+" = "+ (num1+num2));
                break;
            case 2:
                System.out.print("첫번째 피연산자를 입력해주세요>> ");
                int num3 = scanner.nextInt();

                System.out.print("두번째 피연산자를 입력해주세요>> ");
                int num4 = scanner.nextInt();

                System.out.print(num3 +" - "+ num4+" = "+ (num3-num4));
                break;
            case 3:
                System.out.print("첫번째 피연산자를 입력해주세요>> ");
                int num5 = scanner.nextInt();

                System.out.print("두번째 피연산자를 입력해주세요>> ");
                int num6 = scanner.nextInt();

                System.out.print(num5 +" * "+ num6+" = "+ (num5*num6));
                break;
            case 4:
                System.out.print("첫번째 피연산자를 입력해주세요>> ");
                int num7 = scanner.nextInt();

                System.out.print("두번째 피연산자를 입력해주세요>> ");
                int num8 = scanner.nextInt();

                System.out.print(num7 +" / "+ num8+" = "+ (num7/num8));
                break;
            case 5:
                System.out.print("첫번째 피연산자를 입력해주세요>> ");
                int num9 = scanner.nextInt();

                System.out.print("두번째 피연산자를 입력해주세요>> ");
                int num10 = scanner.nextInt();

                System.out.print(num9 +" % "+ num10+" = "+ (num9%num10));
                break;
            case 6:
                System.out.print("프로그램이 종료되었습니다.");
                break;



        }






    }
}
