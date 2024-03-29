import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int p1, p2;
        int operator=0;

        while (operator != 6) {
        Scanner sc = new Scanner(System.in);

        System.out.println("수행하고싶은 연산을 입력해주세요>> ");
        operator = sc.nextInt();
        if(operator==6){
            System.out.println("프로그램이 종료되었습니다.");
            return;
        }
        System.out.println("첫번째 피연산자를 입력해주세요>> ");
        p1 = sc.nextInt();
        System.out.println("두번째 피연산자를 입력해주세요>> ");
        p2 = sc.nextInt();

        int result = 0;
            switch (operator) {
                case 1:
                    result=p1+p2;
                    System.out.println(p1 + " + " + p2 + " = " + result);
                    break;
                case 2:
                    result=p1-p2;
                    System.out.println(p1 + " - " + p2 + " = " + result);
                    break;
                case 3:
                    result=p1*p2;
                    System.out.println(p1 + " * " + p2 + " = " + result);
                    break;
                case 4:
                    if (p2 != 0) {
                        result = p1 / p2;
                        System.out.println(p1 + " / " + p2 + " = " + result);
                    } else {
                        return;
                    }
                    break;
                case 5:
                    result=p1%p2;
                    System.out.println(p1 + " % " + p2 + " = " + result);
                    break;
                default:
                    break;
            }
        }
    }
}
