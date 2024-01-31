package chap_02.practice2;

// 증감 연산자 사용:
// 사용자로부터 하나의 숫자를 입력받아, 그 숫자에 대해 전위 증감과 후위 증감 연산을 수행한 결과를 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

public class practice02_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println("입력받은 숫자 : " + num);
        int input1 = ++num;
        int input2 = num++;
        System.out.println("전위 증감 숫자 : " + input1);
        System.out.println("후위 증감 숫자 : " + input2);

    }
}
