package chap_02.practice2;

// 비트 연산 프로그램:
// 사용자로부터 두 개의 정수를 입력받아, 이들에 대한 비트 AND, OR, XOR 연산의 결과를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class practice02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = scanner.nextInt();
        int resultAnd = num1 & num2;
        int resultOr = num1 | num2;
        int resultXor = num1 ^ num2;

        System.out.println("비트 AND 결과 : " + resultAnd);
        System.out.println("비트 OR 결과 : " + resultOr);
        System.out.println("비트 XOR 결과 : " + resultXor);
    }
}
