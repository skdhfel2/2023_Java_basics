package chap_02.practice2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//비트 시프트 연산 프로그램:
//사용자로부터 하나의 정수를 입력받아, 이 숫자에 대해 좌측 시프트와 우측 시프트 연산을 수행한 결과를 출력하는 프로그램을 작성하세요.
public class practice2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = scanner.nextInt();
        int leftShiftResult = number << 2;
        int rightShiftResult = number >> 2;
        System.out.println("좌측 쉬프트 결과 : " +leftShiftResult);
        System.out.println("우측 쉬프트 결과 : " +rightShiftResult);

        scanner.close();
    }
}
