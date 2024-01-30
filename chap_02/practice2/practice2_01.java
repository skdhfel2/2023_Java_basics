package chap_02.practice2;

import java.util.Scanner;

//사칙 연산 프로그램:
//사용자로부터 두 개의 숫자를 입력받아, 덧셈(addition), 뺄셈(subtraction), 곱셈(multiplication), 나눗셈(division)의 결과를 출력하는 간단한 계산기 프로그램을 작성하세요.

public class practice2_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        double num1 = scanner.nextDouble();
        System.out.print("두번째 숫자를 입력하세요 : ");
        double num2 = scanner.nextDouble();

        System.out.println("addition : " + (num1 + num2));
        System.out.println("subtraction : " + (num1 - num2));
        System.out.println("multiplication : " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("division : " + (num1 / num2));
        }
        else {
            System.out.println("나눌수 없습니다.");
        }
        scanner.close();
    }
}
