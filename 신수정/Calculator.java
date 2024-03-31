import java.util.Scanner; //입력받는클래스
public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("==== 지원하는 연산 ====\n1.   +   (더하기)\n2.   -   (빼기)\n3.   *   (곱하기)\n4.   /   (몫)\n5.   %   (나머지)\n6.   종료\n====================\n\n");
        Scanner sc=new Scanner(System.in); //입력객체만듦

        while(true)
        {
            System.out.println("수행하고 싶은 연산을 선택해주세요>> ");
            int a = sc.nextInt();

            if (a == 6)
            {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

            System.out.println("첫번째 피연산자를 입력해주세요>> ");
            int x=sc.nextInt();
            System.out.println("두번째 피연산자를 입력해주세요>> ");
            int y=sc.nextInt();

            int r=0; //result
            String op=""; //operator

            switch(a)
            {
                case 1: r=x+y; op=" + "; break;
                case 2: r=x-y; op=" - "; break;
                case 3: r=x*y; op=" * ";break;
                case 4: r= x /y; op=" / "; break;
                case 5: r=x%y; op=" % "; break;
            }
            System.out.println(x + op +y + " = " + r);
        }
        sc.close();
    }
}
