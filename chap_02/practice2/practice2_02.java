package chap_02.practice2;
// 나머지 연산 프로그램:
// 사용자로부터 두 개의 정수를 입력받아, 나머지 연산의 결과를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class practice2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수값 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정수값 : ");
        int num2 = scanner.nextInt();
        System.out.println("두 정수의 나머지 : " + (num1 % num2));

        scanner.close();
    }
}
