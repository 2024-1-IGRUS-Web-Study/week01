import java.util.Scanner;
public class studyHW01 {
    public static void main(String[] args) {
        System.out.println("=== 지원하는 연산===");
        System.out.println("1. +(더하기)");
        System.out.println("2.  -(빼기)");
        System.out.println("3.  *(곱하기)");
        System.out.println("4.  /(몫)");
        System.out.println("5.  %(나머지)");
        System.out.println("6.  종료");
        System.out.println("=================");
        System.out.println("수행하고 싶은 연산을 선택해주세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==6) {
            System.out.println("프로그램이 종료됐습니다");
            return;
        }
        System.out.println("첫번째 피연산자를 입력해주세요");
        int b = sc.nextInt();
        System.out.println("두번째 피연산자를 입력해주세요");
        int c = sc.nextInt();
        if (a == 1) {
            System.out.println(b+c);
        } else if (a==2){
            System.out.println(b-c);
        } else if (a==3) {
            System.out.println(b*c);
        } else if (a==4) {
            System.out.println(b/c);
        } else if (a==5) {
            System.out.println(b%c);
        }
    }
}
