package chap_02.practice2;

import java.util.Scanner;

// 논리 연산자 사용:
// 사용자로부터 두 개의 논리값(true 또는 false)을 입력받아, 논리 AND, OR, NOT 연산의 결과를 출력하는 프로그램을 작성하세요.
public class practice02_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 논리값을(true / false) 입력하세요 : ");
        boolean input1 = scanner.nextBoolean();
        System.out.print("두번째 논리값을(true / false) 입력하세요 : ");
        boolean input2 = scanner.nextBoolean();
        boolean resultAnd = (input1 && input2);
        boolean resultOr = (input1 || input2);
        boolean resultNot1 = !input1;
        boolean resultNot2 = !input2;
        System.out.println("AND의 논리값 : " + resultAnd);
        System.out.println("OR의 논리값 : " + resultOr);
        System.out.println("첫번째의 논리값의 NOT 결과 : " + resultNot1);
        System.out.println("두번째의 논리값의 NOT 결과 : " + resultNot2);
    }
}
