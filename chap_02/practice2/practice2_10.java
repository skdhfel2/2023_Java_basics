package chap_02.practice2;

import java.util.Scanner;

// 문자열 연결 프로그램:
// 사용자로부터 두 개의 문자열을 입력받아, 이를 연결하여 출력하는 프로그램을 작성하세요.
public class practice2_10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("첫번째 문자열을 입력하세요 : ");
    String input1 = scanner.nextLine();
    System.out.print("두번째 문자열을 입력하세요 : ");
    String input2 = scanner.nextLine();
    System.out.println("두개의 문자열을 이은 결과 : " + input1.concat(input2));
    }
}
