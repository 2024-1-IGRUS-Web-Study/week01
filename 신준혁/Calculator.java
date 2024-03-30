import java.util.*;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type_input;
        do {System.out.println("==== 지원하는 연산 ====");
            System.out.println("1. + (더하기)");
            System.out.println("2. - (빼기)");
            System.out.println("3. * (곱하기)");
            System.out.println("4. / (몫)");
            System.out.println("5. % (나머지)");
            System.out.println("6. 종료");
            System.out.println("==================");
            System.out.println("수행하고 싶은 연산을 선택해주세요.");
            type_input = scanner.nextInt();
            if(type_input == 6){
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
            System.out.println("첫번째 피연산자를 입력해주세요.");
            int number1 = scanner.nextInt();
            System.out.println("두번째 피연산자를 입력해주세요.");
            int number2 = scanner.nextInt();

            switch (type_input) {
                case 1: {
                    System.out.printf("%d + %d = %d%n", number1, number2, number1+number2);
                    break;
                }
                case 2: {
                    System.out.printf("%d - %d = %d%n", number1, number2, number1-number2);
                    break;
                }
                case 3: {
                    System.out.printf("%d * %d = %d%n", number1, number2, number1*number2);
                    break;
                }
                case 4: {
                    System.out.printf("%d / %d = %d%n", number1, number2, number1/number2);
                    break;
                }
                case 5: {
                    System.out.printf("%d %% %d = %d%n", number1 , number2 , number1%number2);
                    break;
                }
            }
       }while(type_input != 6);
    }
}
