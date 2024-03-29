package week1;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str;
        int num1, num2;

        while(true) {
            System.out.println("==== 지원하는 연산 ====");
            System.out.println("1.  + (더하기)");
            System.out.println("2.  - (뺴기)");
            System.out.println("3.  * (곱하기)");
            System.out.println("4.  / (몫)");
            System.out.println("5.  % (나머지)");
            System.out.println("6.  종료");
            System.out.println("====================\n");

            System.out.println("수행하고 싶은 연산을 선택해주세요>> ");
            str = cin.next();
            if(str.equals("6"))
            {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            System.out.println("첫번째 피연산자를 입력해주세요>> ");
            num1 = cin.nextInt();
            System.out.println("두번쨰 피연산자를 입력해주세요>> ");
            num2 = cin.nextInt();

            if(str.equals("1"))
                System.out.println(num1 + " + " +num2 + " = " + (num1 + num2));
            else if( str.equals("2"))
                System.out.println(num1 + " - " +num2 + " = " + (num1 - num2));
            else if(str.equals("3"))
                System.out.println(num1 + " * " +num2 + " = " + (num1 * num2));
            else if(str.equals("4"))
                System.out.println(num1 + " / " +num2 + " = " + (num1 / num2));
            else if(str.equals("5"))
                System.out.println(num1 + " % " +num2 + " = " + (num1 % num2));
        }
    }
}
