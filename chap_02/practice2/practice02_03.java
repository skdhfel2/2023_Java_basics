package chap_02.practice2;
//삼항 연산자 사용:
//사용자로부터 두 개의 숫자를 입력받아, 두 숫자 중 큰 숫자를 출력하는 프로그램을 삼항 연산자를 활용하여 작성하세요.

import java.util.Scanner;

public class practice02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();
        int maxNum = (num1 > num2) ? num1 : num2;
        System.out.println("가장 큰 숫자 :" + maxNum);
        scanner.close();
    }
}
