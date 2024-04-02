import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {

//sout
        int c=0;
        Scanner scanner=new Scanner(System.in);
        while(c!=6){
            System.out.println("=====지원하는 연산======");
            System.out.println("1.   +  (더하기)");
            System.out.println("2.   -  (빼기)");
            System.out.println("3.   *  (곱하기)");
            System.out.println("4.   /  (몫)");
            System.out.println("5.   %  (나머지)");
            System.out.println("6.   종료");
            System.out.println("====================");
            System.out.print("수행하고 싶은 연산을 선택해주세요>>");

            c = scanner.nextInt();
            if(c==6)
            {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            System.out.print("첫번째 피연산자를 입력해주세요>>");
            int p1 = scanner.nextInt();
            System.out.print("두번째 피연산자를 입력해주세요>>");
            int p2 = scanner.nextInt();
            if (c == 1) {
                System.out.println(p1 + " + " + p2 + " = " + (p1 + p2));
            } else if (c == 2) {
                System.out.println(p1 + " - " + p2 + " = " + (p1 - p2));
            } else if (c == 3) {
                System.out.println(p1 + " * " + p2 + " = " + (p1 * p2));
            } else if (c == 4) {
                System.out.println(p1 + " / " + p2 + " = " + (p1 / p2));
            } else if (c == 5) {
                System.out.println(p1 + " % " + p2 + " = " + (p1 % p2));
            }
        }


    }

}
