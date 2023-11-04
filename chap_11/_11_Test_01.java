package chap_11;

// 문제: 두 정수를 입력받아 첫 번째 수를 두 번째 수로 나누는 프로그램을 작성하십시오.두 번째 수가 0인 경우, ArithmeticException이 발생하도록예외 처리 코드를 작성하십시오.
// ArithmeticException 예외 처리

import java.util.InputMismatchException;
import java.util.Scanner;

public class _11_Test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("나눌 수를 입력하세요: ");
            int num1 = scanner.nextInt();
            System.out.println("나누는 수를 입력하세요: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("나눈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. 다른 수를 입력하세요.");
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닌 문자열을 입력 했습니다. 숫자를 입력하세요.");
        }
    }
}

